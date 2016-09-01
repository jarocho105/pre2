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

import com.bydan.erp.contabilidad.util.FormatoConstantesFunciones;
import com.bydan.erp.contabilidad.util.FormatoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.FormatoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.FormatoBean;
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
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class FormatoBeanSwingJInternalFrame extends FormatoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FormatoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Formato> formatoValidator = new ClassValidator<Formato>(Formato.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Formato formato;	
	public Formato formatoAux;
	public Formato formatoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Formato formatoTotales;
	public Long idFormatoActual;
	public Long iIdNuevoFormato=0L;
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

	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
	}

	public String sFinalQueryComboTipoMovimiento="";

	public List<TipoMovimiento> tipomovimientosForeignKey;

	public List<TipoMovimiento> gettipomovimientosForeignKey() {
		return tipomovimientosForeignKey;
	}

	public void settipomovimientosForeignKey(List<TipoMovimiento> tipomovimientosForeignKey) {
		this.tipomovimientosForeignKey = tipomovimientosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoMovimiento tipomovimientoForeignKey;

	public TipoMovimiento gettipomovimientoForeignKey() {
		return tipomovimientoForeignKey;
	}

	public void settipomovimientoForeignKey(TipoMovimiento tipomovimientoForeignKey) {
		this.tipomovimientoForeignKey = tipomovimientoForeignKey;
	}

	public String sFinalQueryComboTipoFormato="";

	public List<TipoFormato> tipoformatosForeignKey;

	public List<TipoFormato> gettipoformatosForeignKey() {
		return tipoformatosForeignKey;
	}

	public void settipoformatosForeignKey(List<TipoFormato> tipoformatosForeignKey) {
		this.tipoformatosForeignKey = tipoformatosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoFormato tipoformatoForeignKey;

	public TipoFormato gettipoformatoForeignKey() {
		return tipoformatoForeignKey;
	}

	public void settipoformatoForeignKey(TipoFormato tipoformatoForeignKey) {
		this.tipoformatoForeignKey = tipoformatoForeignKey;
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
	
	public Boolean isPermisoTodoFormato;
	public Boolean isPermisoNuevoFormato;
	public Boolean isPermisoActualizarFormato;
	public Boolean isPermisoActualizarOriginalFormato;
	public Boolean isPermisoEliminarFormato;
	public Boolean isPermisoGuardarCambiosFormato;
	public Boolean isPermisoConsultaFormato;
	public Boolean isPermisoBusquedaFormato;
	public Boolean isPermisoReporteFormato;
	public Boolean isPermisoPaginacionMedioFormato;
	public Boolean isPermisoPaginacionAltoFormato;
	public Boolean isPermisoPaginacionTodoFormato;
	public Boolean isPermisoCopiarFormato;
	public Boolean isPermisoVerFormFormato;
	public Boolean isPermisoDuplicarFormato;
	public Boolean isPermisoOrdenFormato;
	
	
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
	
	public FormatoParameterReturnGeneral formatoReturnGeneral;
	public FormatoParameterReturnGeneral formatoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFormato=false;
	public Boolean esParaAccionDesdeFormularioFormato=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FormatoSessionBeanAdditional formatoSessionBeanAdditional=null;
	
	public FormatoSessionBeanAdditional getFormatoSessionBeanAdditional() {
		return this.formatoSessionBeanAdditional;
	}
	
	public void setFormatoSessionBeanAdditional(FormatoSessionBeanAdditional formatoSessionBeanAdditional) {
		try {
			this.formatoSessionBeanAdditional=formatoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FormatoBeanSwingJInternalFrameAdditional formatoBeanSwingJInternalFrameAdditional=null;
	//public class FormatoBeanSwingJInternalFrame
	
	public FormatoBeanSwingJInternalFrameAdditional getFormatoBeanSwingJInternalFrameAdditional() {
		return this.formatoBeanSwingJInternalFrameAdditional;
	}
	
	public void setFormatoBeanSwingJInternalFrameAdditional(FormatoBeanSwingJInternalFrameAdditional formatoBeanSwingJInternalFrameAdditional) {
		try {
			this.formatoBeanSwingJInternalFrameAdditional=formatoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FormatoLogic formatoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Formato formatoBean;
	public FormatoConstantesFunciones formatoConstantesFunciones;
	//public FormatoParameterReturnGeneral formatoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ModuloLogic moduloLogic;
	public TipoMovimientoLogic tipomovimientoLogic;
	public TipoFormatoLogic tipoformatoLogic;
	
	//PARAMETROS
	
	
	//public List<Formato> formatos;	
	//public List<Formato> formatosEliminados;
	//public List<Formato> formatosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFormato=false;
	public Boolean isVisibilidadCeldaDuplicarFormato=true;
	public Boolean isVisibilidadCeldaCopiarFormato=true;
	public Boolean isVisibilidadCeldaVerFormFormato=true;
	public Boolean isVisibilidadCeldaOrdenFormato=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFormato=false;
	public Boolean isVisibilidadCeldaModificarFormato=false;
	public Boolean isVisibilidadCeldaActualizarFormato=false;
	public Boolean isVisibilidadCeldaEliminarFormato=false;
	public Boolean isVisibilidadCeldaCancelarFormato=false;
	public Boolean isVisibilidadCeldaGuardarFormato=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFormato=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdTipoFormato=false;
	public Boolean isVisibilidadFK_IdTipoMovimiento=false;
	
	public Long getiIdNuevoFormato() {
		return this.iIdNuevoFormato;
	}

	public void setiIdNuevoFormato(Long iIdNuevoFormato) {
		this.iIdNuevoFormato = iIdNuevoFormato;
	}
	
	public Long getidFormatoActual() {
		return this.idFormatoActual;
	}

	public void setidFormatoActual(Long idFormatoActual) {
		this.idFormatoActual = idFormatoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Formato getformato() {
		return this.formato;
	}

	public void setformato(Formato formato) {
		this.formato = formato;
	}
	
	public Formato getformatoAux() {
		return this.formatoAux;
	}

	public void setformatoAux(Formato formatoAux) {
		this.formatoAux = formatoAux;
	}				
	
	public Formato getformatoAnterior() {
		return this.formatoAnterior;
	}

	public void setformatoAnterior(Formato formatoAnterior) {
		this.formatoAnterior = formatoAnterior;
	}	
	
	public Formato getformatoTotales() {
		return this.formatoTotales;
	}

	public void setformatoTotales(Formato formatoTotales) {
		this.formatoTotales = formatoTotales;
	}	
	
	public Formato getformatoBean() {
		return this.formatoBean;
	}

	public void setformatoBean(Formato formatoBean) {
		this.formatoBean = formatoBean;
	}	
	
	public FormatoParameterReturnGeneral getformatoReturnGeneral() {
		return this.formatoReturnGeneral;
	}

	public void setformatoReturnGeneral(FormatoParameterReturnGeneral formatoReturnGeneral) {
		this.formatoReturnGeneral = formatoReturnGeneral;
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

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

	public Long id_tipo_formatoFK_IdTipoFormato=-1L;

	public Long getid_tipo_formatoFK_IdTipoFormato() {
		return this.id_tipo_formatoFK_IdTipoFormato;
	}

	public void setid_tipo_formatoFK_IdTipoFormato(Long id_tipo_formatoFK_IdTipoFormato) {
		this.id_tipo_formatoFK_IdTipoFormato = id_tipo_formatoFK_IdTipoFormato;
	}

	public Long id_tipo_movimientoFK_IdTipoMovimiento=-1L;

	public Long getid_tipo_movimientoFK_IdTipoMovimiento() {
		return this.id_tipo_movimientoFK_IdTipoMovimiento;
	}

	public void setid_tipo_movimientoFK_IdTipoMovimiento(Long id_tipo_movimientoFK_IdTipoMovimiento) {
		this.id_tipo_movimientoFK_IdTipoMovimiento = id_tipo_movimientoFK_IdTipoMovimiento;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FormatoLogic getFormatoLogic()	{		
		return formatoLogic;
	}

	public void setFormatoLogic(FormatoLogic formatoLogic) {
		this.formatoLogic = formatoLogic;
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
	
	public Boolean getIsEsNuevoFormato() {
		return isEsNuevoFormato;
	}

	public void setIsEsNuevoFormato(Boolean isEsNuevoFormato) {
		this.isEsNuevoFormato = isEsNuevoFormato;
	}

	public Boolean getEsParaAccionDesdeFormularioFormato() {
		return esParaAccionDesdeFormularioFormato;
	}
	
	public void setEsParaAccionDesdeFormularioFormato(Boolean esParaAccionDesdeFormularioFormato) {
		this.esParaAccionDesdeFormularioFormato = esParaAccionDesdeFormularioFormato;
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

			if(this.formatoSessionBean==null) {
				this.formatoSessionBean=new FormatoSessionBean();
			}

			if(!this.formatoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(formatoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.formatoSessionBean==null) {
				this.formatoSessionBean=new FormatoSessionBean();
			}

			if(!this.formatoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(formatoSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
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

	public void cargarCombosTipoMovimientosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoMovimientoLogic tipomovimientoLogic=new TipoMovimientoLogic();

			//tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingKeyData(true);

			if(this.formatoSessionBean==null) {
				this.formatoSessionBean=new FormatoSessionBean();
			}

			if(!this.formatoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingKeyData(true);

					tipomovimientoLogic.getTodosTipoMovimientosWithConnection(sFinalQuery,new Pagination());

					this.tipomovimientosForeignKey=tipomovimientoLogic.getTipoMovimientos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoMovimiento(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientoLogic.getEntityWithConnection(formatoSessionBean.getlidTipoMovimientoActual());
					this.tipomovimientosForeignKey.add(tipomovimientoLogic.getTipoMovimiento());
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

	public void cargarCombosTipoFormatosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoformatosForeignKey=new ArrayList<TipoFormato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoFormatoLogic tipoformatoLogic=new TipoFormatoLogic();

			//tipoformatoLogic.getTipoFormatoDataAccess().setIsForForeingKeyData(true);

			if(this.formatoSessionBean==null) {
				this.formatoSessionBean=new FormatoSessionBean();
			}

			if(!this.formatoSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormato()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoformatoLogic.getTipoFormatoDataAccess().setIsForForeingKeyData(true);

					tipoformatoLogic.getTodosTipoFormatosWithConnection(sFinalQuery,new Pagination());

					this.tipoformatosForeignKey=tipoformatoLogic.getTipoFormatos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoFormato(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformatoLogic.getEntityWithConnection(formatoSessionBean.getlidTipoFormatoActual());
					this.tipoformatosForeignKey.add(tipoformatoLogic.getTipoFormato());
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

					if(this.formato!=null) {
						this.formato.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFormato!=null) {
						this.jInternalFrameDetalleFormFormato.jComboBoxid_empresaFormato.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFormato.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFormato!=null) {
						if(this.jInternalFrameDetalleFormFormato.jComboBoxid_empresaFormato.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormato.jComboBoxid_empresaFormato.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFormatoGenerico)throws Exception
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
				jComboBoxid_empresaFormatoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFormatoGenerico!=null && jComboBoxid_empresaFormatoGenerico.getItemCount()>0) {
					jComboBoxid_empresaFormatoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.formato!=null) {
						this.formato.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormFormato!=null) {
						this.jInternalFrameDetalleFormFormato.jComboBoxid_moduloFormato.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloFormato.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormFormato!=null) {
						if(this.jInternalFrameDetalleFormFormato.jComboBoxid_moduloFormato.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormato.jComboBoxid_moduloFormato.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloFK_IdModuloFormato!=null) {
						jComboBoxid_moduloFK_IdModuloFormato.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloFK_IdModuloFormato!=null) {
							//jComboBoxid_moduloFK_IdModuloFormato.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloFK_IdModuloFormato.getItemCount()>0) {
								jComboBoxid_moduloFK_IdModuloFormato.setSelectedIndex(0);
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

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloFormatoGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloFormatoGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloFormatoGenerico!=null && jComboBoxid_moduloFormatoGenerico.getItemCount()>0) {
					jComboBoxid_moduloFormatoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoMovimientoForeignKey(Long idTipoMovimientoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipomovimientoTemp!=null) {

					if(this.formato!=null) {
						this.formato.setTipoMovimiento(tipomovimientoTemp);
					}

					if(this.jInternalFrameDetalleFormFormato!=null) {
						this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_movimientoFormato.setSelectedItem(tipomovimientoTemp);
					}
				} else {
					//jComboBoxid_tipo_movimientoFormato.setSelectedItem(tipomovimientoTemp);
					if(this.jInternalFrameDetalleFormFormato!=null) {
						if(this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_movimientoFormato.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_movimientoFormato.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoMovimiento") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomovimientoTemp!=null && jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato!=null) {
						jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato.setSelectedItem(tipomovimientoTemp);
					} else {
						if(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato!=null) {
							//jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato.setSelectedItem(tipomovimientoTemp);
							if(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato.getItemCount()>0) {
								jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato.setSelectedIndex(0);
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

	public String getActualTipoMovimientoForeignKeyDescripcion(Long idTipoMovimientoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}


			sDescripcion=TipoMovimientoConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoMovimientoForeignKeyGenerico(Long idTipoMovimientoSeleccionado,JComboBox jComboBoxid_tipo_movimientoFormatoGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			if(tipomovimientoTemp!=null) {
				jComboBoxid_tipo_movimientoFormatoGenerico.setSelectedItem(tipomovimientoTemp);
			} else {
				if(jComboBoxid_tipo_movimientoFormatoGenerico!=null && jComboBoxid_tipo_movimientoFormatoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_movimientoFormatoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoFormatoForeignKey(Long idTipoFormatoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoFormato  tipoformatoTemp=null;

			for(TipoFormato tipoformatoAux:tipoformatosForeignKey) {
				if(tipoformatoAux.getId()!=null && tipoformatoAux.getId().equals(idTipoFormatoSeleccionado)) {
					tipoformatoTemp=tipoformatoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoformatoTemp!=null) {

					if(this.formato!=null) {
						this.formato.setTipoFormato(tipoformatoTemp);
					}

					if(this.jInternalFrameDetalleFormFormato!=null) {
						this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_formatoFormato.setSelectedItem(tipoformatoTemp);
					}
				} else {
					//jComboBoxid_tipo_formatoFormato.setSelectedItem(tipoformatoTemp);
					if(this.jInternalFrameDetalleFormFormato!=null) {
						if(this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_formatoFormato.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_formatoFormato.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoFormato") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoformatoTemp!=null && jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato!=null) {
						jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato.setSelectedItem(tipoformatoTemp);
					} else {
						if(jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato!=null) {
							//jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato.setSelectedItem(tipoformatoTemp);
							if(jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato.getItemCount()>0) {
								jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato.setSelectedIndex(0);
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

	public String getActualTipoFormatoForeignKeyDescripcion(Long idTipoFormatoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoFormato  tipoformatoTemp=null;

			for(TipoFormato tipoformatoAux:tipoformatosForeignKey) {
				if(tipoformatoAux.getId()!=null && tipoformatoAux.getId().equals(idTipoFormatoSeleccionado)) {
					tipoformatoTemp=tipoformatoAux;
					break;
				}
			}


			sDescripcion=TipoFormatoConstantesFunciones.getTipoFormatoDescripcion(tipoformatoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoFormatoForeignKeyGenerico(Long idTipoFormatoSeleccionado,JComboBox jComboBoxid_tipo_formatoFormatoGenerico)throws Exception
	{
		try
		{
			TipoFormato  tipoformatoTemp=null;

			for(TipoFormato tipoformatoAux:tipoformatosForeignKey) {
				if(tipoformatoAux.getId()!=null && tipoformatoAux.getId().equals(idTipoFormatoSeleccionado)) {
					tipoformatoTemp=tipoformatoAux;
					break;
				}
			}

			if(tipoformatoTemp!=null) {
				jComboBoxid_tipo_formatoFormatoGenerico.setSelectedItem(tipoformatoTemp);
			} else {
				if(jComboBoxid_tipo_formatoFormatoGenerico!=null && jComboBoxid_tipo_formatoFormatoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_formatoFormatoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Formato formato,JComboBox jComboBoxid_empresaFormatoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFormatoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFormato.jComboBoxid_empresaFormato.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFormatoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				formato.setid_empresa(empresaAux.getId());
				formato.setempresa_descripcion(FormatoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				formato.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(Formato formato,JComboBox jComboBoxid_moduloFormatoGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloFormatoGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormFormato.jComboBoxid_moduloFormato.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloFormatoGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				formato.setid_modulo(moduloAux.getId());
				formato.setmodulo_descripcion(FormatoConstantesFunciones.getModuloDescripcion(moduloAux));
				formato.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMovimientoForeignKey(Formato formato,JComboBox jComboBoxid_tipo_movimientoFormatoGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoAux=new TipoMovimiento();

			if(jComboBoxid_tipo_movimientoFormatoGenerico==null) {
				tipomovimientoAux=(TipoMovimiento)this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_movimientoFormato.getSelectedItem();
			} else {
				tipomovimientoAux=(TipoMovimiento)jComboBoxid_tipo_movimientoFormatoGenerico.getSelectedItem();
			}

			if(tipomovimientoAux!=null && tipomovimientoAux.getId()!=null) {
				formato.setid_tipo_movimiento(tipomovimientoAux.getId());
				formato.settipomovimiento_descripcion(FormatoConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoAux));
				formato.setTipoMovimiento(tipomovimientoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoFormatoForeignKey(Formato formato,JComboBox jComboBoxid_tipo_formatoFormatoGenerico)throws Exception
	{
		try
		{
			TipoFormato  tipoformatoAux=new TipoFormato();

			if(jComboBoxid_tipo_formatoFormatoGenerico==null) {
				tipoformatoAux=(TipoFormato)this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_formatoFormato.getSelectedItem();
			} else {
				tipoformatoAux=(TipoFormato)jComboBoxid_tipo_formatoFormatoGenerico.getSelectedItem();
			}

			if(tipoformatoAux!=null && tipoformatoAux.getId()!=null) {
				formato.setid_tipo_formato(tipoformatoAux.getId());
				formato.settipoformato_descripcion(FormatoConstantesFunciones.getTipoFormatoDescripcion(tipoformatoAux));
				formato.setTipoFormato(tipoformatoAux);			}
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

					if(!FormatoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormato!=null) { 
							this.jInternalFrameDetalleFormFormato.jComboBoxid_empresaFormato.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFormato.jComboBoxid_empresaFormato.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormato!=null) { 
					}

					if(!FormatoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormatoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormato!=null) { 
							this.jInternalFrameDetalleFormFormato.jComboBoxid_moduloFormato.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormFormato.jComboBoxid_moduloFormato.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormato!=null) { 
					}

					if(!FormatoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormatoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloFK_IdModuloFormato.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloFK_IdModuloFormato.addItem(modulo);
							}
						}

						if(!FormatoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoMovimientosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoMovimiento=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormatoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormato!=null) { 
							this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_movimientoFormato.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_movimientoFormato.addItem(tipomovimiento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormato!=null) { 
					}

					if(!FormatoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoMovimiento") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormatoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato.addItem(tipomovimiento);
							}
						}

						if(!FormatoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoFormatosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoFormato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormatoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormato!=null) { 
							this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_formatoFormato.removeAllItems();

							for(TipoFormato tipoformato:this.tipoformatosForeignKey) {
								this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_formatoFormato.addItem(tipoformato);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormato!=null) { 
					}

					if(!FormatoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoFormato") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormatoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato.removeAllItems();

							for(TipoFormato tipoformato:this.tipoformatosForeignKey) {
								this.jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato.addItem(tipoformato);
							}
						}

						if(!FormatoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFormato!=null) {
							this.jInternalFrameDetalleFormFormato.jComboBoxid_empresaFormato.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormato!=null) {
							this.jInternalFrameDetalleFormFormato.jComboBoxid_empresaFormato.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormato!=null) {
							this.jInternalFrameDetalleFormFormato.jComboBoxid_moduloFormato.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormato!=null) {
							this.jInternalFrameDetalleFormFormato.jComboBoxid_moduloFormato.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloFK_IdModuloFormato.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloFK_IdModuloFormato.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoMovimientoForeignKey(TipoMovimiento tipomovimiento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormato!=null) {
							this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_movimientoFormato.setSelectedItem(tipomovimiento);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormato!=null) {
							this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_movimientoFormato.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato.setSelectedItem(tipomovimiento);
						} else {
							this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoFormatoForeignKey(TipoFormato tipoformato,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormato!=null) {
							this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_formatoFormato.setSelectedItem(tipoformato);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormato!=null) {
							this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_formatoFormato.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato.setSelectedItem(tipoformato);
						} else {
							this.jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesFormato() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FormatoConstantesFunciones.refrescarForeignKeysDescripcionesFormato(this.formatoLogic.getFormatos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FormatoConstantesFunciones.refrescarForeignKeysDescripcionesFormato(this.formatos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(TipoMovimiento.class));
		classes.add(new Classe(TipoFormato.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//formatoLogic.setFormatos(this.formatos);
			formatoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FormatoParameterReturnGeneral getFormatoParameterGeneral() {
		return this.formatoParameterGeneral;
	}
	
	public void setFormatoParameterGeneral(FormatoParameterReturnGeneral formatoParameterGeneral) {
		this.formatoParameterGeneral = formatoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFormato() {
		return isPermisoTodoFormato;
	}

	public void setIsPermisoTodoFormato(Boolean isPermisoTodoFormato) {
		this.isPermisoTodoFormato = isPermisoTodoFormato;
	}

	public Boolean getIsPermisoNuevoFormato() {
		return isPermisoNuevoFormato;
	}

	public void setIsPermisoNuevoFormato(Boolean isPermisoNuevoFormato) {
		this.isPermisoNuevoFormato = isPermisoNuevoFormato;
	}

	public Boolean getIsPermisoActualizarFormato() {
		return isPermisoActualizarFormato;
	}

	public void setIsPermisoActualizarFormato(Boolean isPermisoActualizarFormato) {
		this.isPermisoActualizarFormato = isPermisoActualizarFormato;
	}

	public Boolean getIsPermisoEliminarFormato() {
		return isPermisoEliminarFormato;
	}

	public void setIsPermisoEliminarFormato(Boolean isPermisoEliminarFormato) {
		this.isPermisoEliminarFormato = isPermisoEliminarFormato;
	}

	public Boolean getIsPermisoGuardarCambiosFormato() {
		return isPermisoGuardarCambiosFormato;
	}

	public void setIsPermisoGuardarCambiosFormato(Boolean isPermisoGuardarCambiosFormato) {
		this.isPermisoGuardarCambiosFormato = isPermisoGuardarCambiosFormato;
	}
	
	public Boolean getIsPermisoConsultaFormato() {
		return isPermisoConsultaFormato;
	}

	public void setIsPermisoConsultaFormato(Boolean isPermisoConsultaFormato) {
		this.isPermisoConsultaFormato = isPermisoConsultaFormato;
	}

	public Boolean getIsPermisoBusquedaFormato() {
		return isPermisoBusquedaFormato;
	}

	public void setIsPermisoBusquedaFormato(Boolean isPermisoBusquedaFormato) {
		this.isPermisoBusquedaFormato = isPermisoBusquedaFormato;
	}

	public Boolean getIsPermisoReporteFormato() {
		return isPermisoReporteFormato;
	}

	public void setIsPermisoReporteFormato(Boolean isPermisoReporteFormato) {
		this.isPermisoReporteFormato = isPermisoReporteFormato;
	}
	
	public Boolean getIsPermisoPaginacionMedioFormato() {
		return isPermisoPaginacionMedioFormato;
	}

	public void setIsPermisoPaginacionMedioFormato(Boolean isPermisoPaginacionMedioFormato) {
		this.isPermisoPaginacionMedioFormato = isPermisoPaginacionMedioFormato;
	}
	
	public Boolean getIsPermisoPaginacionTodoFormato() {
		return isPermisoPaginacionTodoFormato;
	}

	public void setIsPermisoPaginacionTodoFormato(Boolean isPermisoPaginacionTodoFormato) {
		this.isPermisoPaginacionTodoFormato = isPermisoPaginacionTodoFormato;
	}
	
	public Boolean getIsPermisoPaginacionAltoFormato() {
		return isPermisoPaginacionAltoFormato;
	}

	public void setIsPermisoPaginacionAltoFormato(Boolean isPermisoPaginacionAltoFormato) {
		this.isPermisoPaginacionAltoFormato = isPermisoPaginacionAltoFormato;
	}
	
	public Boolean getIsPermisoCopiarFormato() {
		return isPermisoCopiarFormato;
	}

	public void setIsPermisoCopiarFormato(Boolean isPermisoCopiarFormato) {
		this.isPermisoCopiarFormato = isPermisoCopiarFormato;
	}
	
	public Boolean getIsPermisoVerFormFormato() {
		return isPermisoVerFormFormato;
	}

	public void setIsPermisoVerFormFormato(Boolean isPermisoVerFormFormato) {
		this.isPermisoVerFormFormato = isPermisoVerFormFormato;
	}
	
	public Boolean getIsPermisoDuplicarFormato() {
		return isPermisoDuplicarFormato;
	}

	public void setIsPermisoDuplicarFormato(Boolean isPermisoDuplicarFormato) {
		this.isPermisoDuplicarFormato = isPermisoDuplicarFormato;
	}
	
	public Boolean getIsPermisoOrdenFormato() {
		return isPermisoOrdenFormato;
	}

	public void setIsPermisoOrdenFormato(Boolean isPermisoOrdenFormato) {
		this.isPermisoOrdenFormato = isPermisoOrdenFormato;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFormato() {
		return isVisibilidadCeldaNuevoFormato;
	}

	public void setIsVisibilidadCeldaNuevoFormato(Boolean isVisibilidadCeldaNuevoFormato) {
		this.isVisibilidadCeldaNuevoFormato = isVisibilidadCeldaNuevoFormato;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFormato() {
		return isVisibilidadCeldaDuplicarFormato;
	}

	public void setIsVisibilidadCeldaDuplicarFormato(Boolean isVisibilidadCeldaDuplicarFormato) {
		this.isVisibilidadCeldaDuplicarFormato = isVisibilidadCeldaDuplicarFormato;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFormato() {
		return isVisibilidadCeldaCopiarFormato;
	}

	public void setIsVisibilidadCeldaCopiarFormato(Boolean isVisibilidadCeldaCopiarFormato) {
		this.isVisibilidadCeldaCopiarFormato = isVisibilidadCeldaCopiarFormato;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFormato() {
		return isVisibilidadCeldaVerFormFormato;
	}

	public void setIsVisibilidadCeldaVerFormFormato(Boolean isVisibilidadCeldaVerFormFormato) {
		this.isVisibilidadCeldaVerFormFormato = isVisibilidadCeldaVerFormFormato;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFormato() {
		return isVisibilidadCeldaOrdenFormato;
	}

	public void setIsVisibilidadCeldaOrdenFormato(Boolean isVisibilidadCeldaOrdenFormato) {
		this.isVisibilidadCeldaOrdenFormato = isVisibilidadCeldaOrdenFormato;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFormato() {
		return isVisibilidadCeldaNuevoRelacionesFormato;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFormato(Boolean isVisibilidadCeldaNuevoRelacionesFormato) {
		this.isVisibilidadCeldaNuevoRelacionesFormato = isVisibilidadCeldaNuevoRelacionesFormato;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFormato() {
		return isVisibilidadCeldaModificarFormato;
	}

	public void setIsVisibilidadCeldaModificarFormato(Boolean isVisibilidadCeldaModificarFormato) {
		this.isVisibilidadCeldaModificarFormato = isVisibilidadCeldaModificarFormato;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFormato() {
		return isVisibilidadCeldaActualizarFormato;
	}

	public void setIsVisibilidadCeldaActualizarFormato(Boolean isVisibilidadCeldaActualizarFormato) {
		this.isVisibilidadCeldaActualizarFormato = isVisibilidadCeldaActualizarFormato;
	}

	public Boolean getIsVisibilidadCeldaEliminarFormato() {
		return isVisibilidadCeldaEliminarFormato;
	}

	public void setIsVisibilidadCeldaEliminarFormato(Boolean isVisibilidadCeldaEliminarFormato) {
		this.isVisibilidadCeldaEliminarFormato = isVisibilidadCeldaEliminarFormato;
	}

	public Boolean getIsVisibilidadCeldaCancelarFormato() {
		return isVisibilidadCeldaCancelarFormato;
	}

	public void setIsVisibilidadCeldaCancelarFormato(Boolean isVisibilidadCeldaCancelarFormato) {
		this.isVisibilidadCeldaCancelarFormato = isVisibilidadCeldaCancelarFormato;
	}

	public Boolean getIsVisibilidadCeldaGuardarFormato() {
		return isVisibilidadCeldaGuardarFormato;
	}

	public void setIsVisibilidadCeldaGuardarFormato(Boolean isVisibilidadCeldaGuardarFormato) {
		this.isVisibilidadCeldaGuardarFormato = isVisibilidadCeldaGuardarFormato;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFormato() {
		return isVisibilidadCeldaGuardarCambiosFormato;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFormato(Boolean isVisibilidadCeldaGuardarCambiosFormato) {
		this.isVisibilidadCeldaGuardarCambiosFormato = isVisibilidadCeldaGuardarCambiosFormato;
	}
		
	public FormatoSessionBean getformatoSessionBean() {
		return this.formatoSessionBean;
	}
	
	public void setformatoSessionBean(FormatoSessionBean formatoSessionBean) {
		this.formatoSessionBean=formatoSessionBean;
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

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	public Boolean getisVisibilidadFK_IdTipoFormato() {
		return this.isVisibilidadFK_IdTipoFormato;
	}

	public void setisVisibilidadFK_IdTipoFormato(Boolean isVisibilidadFK_IdTipoFormato) {
		this.isVisibilidadFK_IdTipoFormato=isVisibilidadFK_IdTipoFormato;
	}

	public Boolean getisVisibilidadFK_IdTipoMovimiento() {
		return this.isVisibilidadFK_IdTipoMovimiento;
	}

	public void setisVisibilidadFK_IdTipoMovimiento(Boolean isVisibilidadFK_IdTipoMovimiento) {
		this.isVisibilidadFK_IdTipoMovimiento=isVisibilidadFK_IdTipoMovimiento;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFormato(Formato formato)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(formato,null);
				this.setActualParaGuardarModuloForeignKey(formato,null);
				this.setActualParaGuardarTipoMovimientoForeignKey(formato,null);
				this.setActualParaGuardarTipoFormatoForeignKey(formato,null);
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
	
	public void bugActualizarReferenciaActual(Formato formato,Formato formatoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFormato(formato);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		formatoAux.setId(formato.getId());
		formatoAux.setVersionRow(formato.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFormato();
		
			int intSelectedRow = this.jTableDatosFormato.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFormato(this.formato,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = formatoValidator.getInvalidValues(this.formato);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			formatoLogic.setDatosCliente(datosCliente);
			formatoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				formatoAux=new  Formato();
				
				formatoAux.setIsNew(true);
				formatoAux.setIsChanged(true);
				
				formatoAux.setFormatoOriginal(this.formato);
				
				formatoAux.setId(this.formato.getId());	
				formatoAux.setVersionRow(this.formato.getVersionRow());	
				formatoAux.setid_empresa(this.formato.getid_empresa());	
				formatoAux.setid_modulo(this.formato.getid_modulo());	
				formatoAux.setnombre(this.formato.getnombre());	
				formatoAux.setid_tipo_movimiento(this.formato.getid_tipo_movimiento());	
				formatoAux.setid_tipo_formato(this.formato.getid_tipo_formato());	
				formatoAux.setubicacion(this.formato.getubicacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formatoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formatoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(formatoAux,formatoLogic.getFormatos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatoAux,formatos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.formatoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formatoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoLogic.saveFormatos();//WithConnection
						//formatoLogic.getSetVersionRowFormatos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formato,formatoAux);
					
					this.refrescarForeignKeysDescripcionesFormato();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				formatoAux=new  Formato();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.formatoSessionBean.getEsGuardarRelacionado() 
					|| (this.formatoSessionBean.getEsGuardarRelacionado() && this.formato.getId()>=0)) {
						
					formatoAux.setIsNew(false);
				}
				
				formatoAux.setIsDeleted(false);
			
				formatoAux.setId(this.formato.getId());	
				formatoAux.setVersionRow(this.formato.getVersionRow());	
				formatoAux.setid_empresa(this.formato.getid_empresa());	
				formatoAux.setid_modulo(this.formato.getid_modulo());	
				formatoAux.setnombre(this.formato.getnombre());	
				formatoAux.setid_tipo_movimiento(this.formato.getid_tipo_movimiento());	
				formatoAux.setid_tipo_formato(this.formato.getid_tipo_formato());	
				formatoAux.setubicacion(this.formato.getubicacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formatoAux,formatoLogic.getFormatos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatoAux,formatos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.formatoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formatoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoLogic.saveFormatos();//WithConnection
						//formatoLogic.getSetVersionRowFormatos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formato,formatoAux);
					
					this.refrescarForeignKeysDescripcionesFormato();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				formatoAux=new  Formato();
				
				formatoAux.setIsNew(false);
				formatoAux.setIsChanged(false);
				
				formatoAux.setIsDeleted(true);
				
				formatoAux.setId(this.formato.getId());	
				formatoAux.setVersionRow(this.formato.getVersionRow());	
				formatoAux.setid_empresa(this.formato.getid_empresa());	
				formatoAux.setid_modulo(this.formato.getid_modulo());	
				formatoAux.setnombre(this.formato.getnombre());	
				formatoAux.setid_tipo_movimiento(this.formato.getid_tipo_movimiento());	
				formatoAux.setid_tipo_formato(this.formato.getid_tipo_formato());	
				formatoAux.setubicacion(this.formato.getubicacion());	
				
				if(this.formatoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.formatoAux.getId()>=0) {	
						this.formatosEliminados.add(formatoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(formatoAux,formatoLogic.getFormatos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatoAux,formatos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.formatoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formatoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoLogic.saveFormatos();//WithConnection
						//formatoLogic.getSetVersionRowFormatos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.getFormatos().addAll(this.formatosEliminados);
					
					formatoLogic.saveFormatos();//WithConnection
					//formatoLogic.getSetVersionRowFormatos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesFormato();
				
				this.formatosEliminados= new ArrayList<Formato>();		
			}
			
			if(this.formatoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Formato GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Formato",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.formato=formatoAux;
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
      		//this.finishProcessFormato();
      	}
		
	}	
	
	public void actualizarRelaciones(Formato formatoLocal) throws Exception {
		
		if(this.formatoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Formato formatoLocal) throws Exception {	
		if(this.formatoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				formatoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				formatoLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMovimientoDetalleFormJInternalFrame.class)) {
				TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrameLocal=(TipoMovimientoBeanSwingJInternalFrame) ((TipoMovimientoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovimientoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.gettipomovimiento(),true);
				tipomovimientoBeanSwingJInternalFrameLocal.actualizarLista(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento,this.tipomovimientosForeignKey);

				tipomovimientoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				formatoLocal.setTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey("Formulario");
				this.setActualTipoMovimientoForeignKey(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoFormatoDetalleFormJInternalFrame.class)) {
				TipoFormatoBeanSwingJInternalFrame tipoformatoBeanSwingJInternalFrameLocal=(TipoFormatoBeanSwingJInternalFrame) ((TipoFormatoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoformatoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoFormato(tipoformatoBeanSwingJInternalFrameLocal.gettipoformato(),true);
				tipoformatoBeanSwingJInternalFrameLocal.actualizarLista(tipoformatoBeanSwingJInternalFrameLocal.tipoformato,this.tipoformatosForeignKey);

				tipoformatoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoformatoBeanSwingJInternalFrameLocal.tipoformato);

				formatoLocal.setTipoFormato(tipoformatoBeanSwingJInternalFrameLocal.tipoformato);

				this.addItemDefectoCombosForeignKeyTipoFormato();
				this.cargarCombosFrameTipoFormatosForeignKey("Formulario");
				this.setActualTipoFormatoForeignKey(tipoformatoBeanSwingJInternalFrameLocal.tipoformato.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFormatoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFormato.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = formatoValidator.getInvalidValues(this.formato);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Formato formato,List<Formato> formatos) throws Exception {
		try	{		
			FormatoConstantesFunciones.actualizarLista(formato,formatos,this.formatoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Formato formato,List<Formato> formatos) throws Exception {
		try	{			
			FormatoConstantesFunciones.actualizarSelectedLista(formato,formatos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Formato> formatosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				formatosLocal=this.formatoLogic.getFormatos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				formatosLocal=this.formatos;
			}
			//ARCHITECTURE
		
			for(Formato formatoLocal:formatosLocal) {
				if(this.permiteMantenimiento(formatoLocal) && formatoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FormatoConstantesFunciones.getFormatoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FormatoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormato.jLabelid_empresaFormato,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormato.jLabelid_moduloFormato,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormato.jLabelnombreFormato,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoConstantesFunciones.IDTIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormato.jLabelid_tipo_movimientoFormato,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoConstantesFunciones.IDTIPOFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormato.jLabelid_tipo_formatoFormato,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoConstantesFunciones.UBICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormato.jLabelubicacionFormato,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFormato!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormato.jLabelid_empresaFormato,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormato.jLabelid_moduloFormato,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormato.jLabelnombreFormato,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormato.jLabelid_tipo_movimientoFormato,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormato.jLabelid_tipo_formatoFormato,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormato.jLabelubicacionFormato,"");
		
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
		this.iIdNuevoFormato--;	
		
		
		this.formatoAux=new Formato();
		
		this.formatoAux.setId(this.iIdNuevoFormato);
		this.formatoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formatoLogic.getFormatos().add(this.formatoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.formatos.add(this.formatoAux);
		}
		//ARCHITECTURE
		
		this.formato=this.formatoAux;
		
		if(FormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFormato(this.formato);
			this.setVariablesObjetoActualToFormularioForeignKeyFormato(this.formato);
		}
				
		//this.setDefaultControlesFormato();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFormato();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFormato();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormato();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormato(this.formatoBean,this.formato,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(FormatoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.formatoSessionBean.getConGuardarRelaciones()) {
			classes=FormatoConstantesFunciones.getClassesRelationshipsOfFormato(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.formatoReturnGeneral=formatoLogic.procesarEventosFormatosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formatoLogic.getFormatos(),this.formato,this.formatoParameterGeneral,this.isEsNuevoFormato,classes);//this.formatoLogic.getFormato()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFormato(this.formatoReturnGeneral,this.formatoBean,false);
		
		if(this.formatoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFormato(this.formatoReturnGeneral.getFormato());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFormato(this.formatoReturnGeneral.getFormato());
		}
		
		if(this.formatoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFormato(this.formatoReturnGeneral.getFormato(),classes);//this.formatoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFormato(this.formato,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFormato();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFormato();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormatoBeanSwingJInternalFrameAdditional.RecargarFormFormato(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFormato(false);
						
			if(formatoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(FormatoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormato();
			}
			
			this.actualizarVisualTableDatosFormato();
			
			this.jTableDatosFormato.setRowSelectionInterval(this.getIndiceNuevoFormato(), this.getIndiceNuevoFormato());
			
			this.seleccionarFilaTablaFormatoActual();
						
			this.actualizarEstadoCeldasBotonesFormato("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFormato(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFormato.jTextFieldnombreFormato.setEnabled(isHabilitar && this.formatoConstantesFunciones.activarnombreFormato);
		this.jInternalFrameDetalleFormFormato.jTextAreaubicacionFormato.setEnabled(isHabilitar && this.formatoConstantesFunciones.activarubicacionFormato);	
		//
		this.jInternalFrameDetalleFormFormato.jComboBoxid_empresaFormato.setEnabled(isHabilitar && this.formatoConstantesFunciones.activarid_empresaFormato);
		this.jInternalFrameDetalleFormFormato.jComboBoxid_moduloFormato.setEnabled(isHabilitar && this.formatoConstantesFunciones.activarid_moduloFormato);
		this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_movimientoFormato.setEnabled(isHabilitar && this.formatoConstantesFunciones.activarid_tipo_movimientoFormato);
		this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_formatoFormato.setEnabled(isHabilitar && this.formatoConstantesFunciones.activarid_tipo_formatoFormato);
	};
	
	public void setDefaultControlesFormato() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFormato(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.formatoSessionBean.setConGuardarRelaciones(true);			
			this.formatoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFormato.jTabbedPaneRelacionesFormato.setVisible(true);
			
					
		} else {
			//this.formatoSessionBean.setConGuardarRelaciones(false);			
			this.formatoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFormato.jTabbedPaneRelacionesFormato.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoFormato() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Formato formatoAux:this.formatoLogic.getFormatos()) {
				if(formatoAux.getId().equals(this.iIdNuevoFormato)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Formato formatoAux:this.formatos) {
				if(formatoAux.getId().equals(this.iIdNuevoFormato)) {
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
	
	public int getIndiceActualFormato(Formato formato,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Formato formatoAux:this.formatoLogic.getFormatos()) {
				if(formatoAux.getId().equals(formato.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Formato formatoAux:this.formatos) {
				if(formatoAux.getId().equals(formato.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFormato(Formato formatoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Formato formatoAux:this.formatoLogic.getFormatos()) {
				if(formatoAux.getFormatoOriginal().getId().equals(formatoOriginal.getId())) {
					existe=true;
					formatoOriginal.setId(formatoAux.getId());
					formatoOriginal.setVersionRow(formatoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Formato formatoAux:this.formatos) {
				if(formatoAux.getFormatoOriginal().getId().equals(formatoOriginal.getId())) {
					existe=true;
					formatoOriginal.setId(formatoAux.getId());
					formatoOriginal.setVersionRow(formatoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFormato(Boolean esParaCancelar) throws Exception {
		formatosAux=new ArrayList<Formato>();
		formatoAux=new Formato();
		
		if(!this.formatoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Formato formatoAux:this.formatoLogic.getFormatos()) {
					if(formatoAux.getId()<0) {
						formatosAux.add(formatoAux);
					}		
				}
				this.iIdNuevoFormato=0L;
				this.formatoLogic.getFormatos().removeAll(formatosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Formato formatoAux:this.formatos) {
					if(formatoAux.getId()<0) {
						formatosAux.add(formatoAux);
					}		
				}
				this.iIdNuevoFormato=0L;
				this.formatos.removeAll(formatosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFormato 
					&& this.formatoLogic.getFormatos().size()>0
					) {
					formatoAux=this.formatoLogic.getFormatos().get(this.formatoLogic.getFormatos().size() - 1);
				
					if(formatoAux.getId()<0) {
						this.formatoLogic.getFormatos().remove(formatoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFormato && this.formatos.size()>0) {
					formatoAux=this.formatos.get(this.formatos.size() - 1);
				
					if(formatoAux.getId()<0) {
						this.formatos.remove(formatoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFormato(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(formato.getId()<0) {
				this.formatoLogic.getFormatos().remove(this.formato);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(formato.getId()<0) {
				this.formatos.remove(this.formato);
			}
		}			
	}
	
	public void setEstadosInicialesFormato(List<Formato> formatosAux) throws Exception {
		FormatoConstantesFunciones.setEstadosInicialesFormato(formatosAux);
	}
	
	public void setEstadosInicialesFormato(Formato formatoAux) throws Exception {
		FormatoConstantesFunciones.setEstadosInicialesFormato(formatoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFormatoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFormato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFormatoActual()) {
				if(!this.isEsNuevoFormato) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFormato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFormato=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFormatoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Formato ?", "MANTENIMIENTO DE Formato", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFormato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Formato formato) throws Exception {
		FormatoConstantesFunciones.seleccionarAsignar(this.formato,formato);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFormato=this.isPermisoActualizarOriginalFormato;
			
			
			this.seleccionarAsignar(formato);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormatoConstantesFunciones.quitarEspaciosFormato(this.formato,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFormato("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.formatoSessionBean.setsFuncionBusquedaRapida(this.formatoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFormato) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFormato(esParaCancelar);				
				this.cancelarNuevoFormato(esParaCancelar);								
			}
			
			this.formato=new Formato();
			
			this.inicializarFormato();
			
			this.actualizarEstadoCeldasBotonesFormato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFormato() throws Exception {
		try {
			FormatoConstantesFunciones.inicializarFormato(this.formato);
			
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
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.formatoLogic.getFormatos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFormatos(String sAccionBusqueda,List<Formato> formatosParaReportes) throws Exception {
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
					sPathReporteFinal="Formato"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FormatoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FormatoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Formato"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Formatoes");		
		parameters.put("busquedapor", FormatoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFormato=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FormatoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FormatoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFormato=new JRBeanArrayDataSource(FormatoJInternalFrame.TraerFormatoBeans(formatosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFormato);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FormatoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FormatoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FormatoBean.TraerFormatoBeans(formatosParaReportes).toArray()));
							
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
				this.generarExcelReporteFormatos(sAccionBusqueda,sTipoArchivoReporte,formatosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFormatos(sAccionBusqueda,sTipoArchivoReporte,formatosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFormatoActionPerformed(null);
					//this.generarExcelReporteFormatos(sAccionBusqueda,sTipoArchivoReporte,formatosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFormatos(sAccionBusqueda,sTipoArchivoReporte,formatosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFormatos(sAccionBusqueda,sTipoArchivoReporte,formatosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFormatos(sAccionBusqueda,sTipoArchivoReporte,formatosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFormatos(String sAccionBusqueda,String sTipoArchivoReporte,List<Formato> formatosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formato";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Formatos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormato("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Formato formato : formatosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FormatoConstantesFunciones.generarExcelReporteDataFormato("NORMAL",row,workbook,formato,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFormato(String sTipo,Row row,Workbook workbook) {
		
		FormatoConstantesFunciones.generarExcelReporteHeaderFormato(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFormatos(String sAccionBusqueda,String sTipoArchivoReporte,List<Formato> formatosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formato_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Formatos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Formato formato : formatosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FormatoConstantesFunciones.getFormatoDescripcion(formato));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formato.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formato.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formato.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formato.gettipomovimiento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoConstantesFunciones.LABEL_IDTIPOFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoConstantesFunciones.LABEL_IDTIPOFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formato.gettipoformato_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoConstantesFunciones.LABEL_UBICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoConstantesFunciones.LABEL_UBICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formato.getubicacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFormatos(String sAccionBusqueda,String sTipoArchivoReporte,List<Formato> formatosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Formato> formatosRespaldo=null;
		
		classes=FormatoConstantesFunciones.getClassesRelationshipsOfFormato(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.formatoLogic.setDatosCliente(this.datosCliente);
		this.formatoLogic.setDatosDeep(this.datosDeep);
		this.formatoLogic.setIsConDeep(true);
		
		formatosRespaldo=this.formatoLogic.getFormatos();
		
		this.formatoLogic.setFormatos(formatosParaReportes);	
		this.formatoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		formatosParaReportes=this.formatoLogic.getFormatos();
		this.formatoLogic.setFormatos(formatosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formato_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Formatos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormato("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Formato formato : formatosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFormato("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FormatoConstantesFunciones.generarExcelReporteDataFormato("NORMAL",row,workbook,formato,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FormatoConstantesFunciones.getFormatoDescripcion(formato));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormato.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormato.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormato.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormato.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFormato() throws Exception {		
		this.startProcessFormato(true);
	}
	
	public void startProcessFormato(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFormato ,this.jPanelParametrosReportesFormato, this.jScrollPanelDatosFormato,this.jPanelPaginacionFormato, this.jScrollPanelDatosEdicionFormato, this.jPanelAccionesFormato,this.jPanelAccionesFormularioFormato,this.jmenuBarFormato,this.jmenuBarDetalleFormato,this.jTtoolBarFormato,this.jTtoolBarDetalleFormato);		
		
		final JTabbedPane jTabbedPaneBusquedasFormato=this.jTabbedPaneBusquedasFormato; 
		
		final JPanel jPanelParametrosReportesFormato=this.jPanelParametrosReportesFormato;
		//final JScrollPane jScrollPanelDatosFormato=this.jScrollPanelDatosFormato;
		final JTable jTableDatosFormato=this.jTableDatosFormato;		
		final JPanel jPanelPaginacionFormato=this.jPanelPaginacionFormato;
		//final JScrollPane jScrollPanelDatosEdicionFormato=this.jScrollPanelDatosEdicionFormato;
		final JPanel jPanelAccionesFormato=this.jPanelAccionesFormato;
		
		JPanel jPanelCamposAuxiliarFormato=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFormato=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFormato!=null) {
			jPanelCamposAuxiliarFormato=this.jInternalFrameDetalleFormFormato.jPanelCamposFormato;
			jPanelAccionesFormularioAuxiliarFormato=this.jInternalFrameDetalleFormFormato.jPanelAccionesFormularioFormato;
		}
		
		final JPanel jPanelCamposFormato=jPanelCamposAuxiliarFormato;
		final JPanel jPanelAccionesFormularioFormato=jPanelAccionesFormularioAuxiliarFormato;
		
		
		final JMenuBar jmenuBarFormato=this.jmenuBarFormato;
		final JToolBar jTtoolBarFormato=this.jTtoolBarFormato;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFormato=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormato=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFormato!=null) {
			jmenuBarDetalleAuxiliarFormato=this.jInternalFrameDetalleFormFormato.jmenuBarDetalleFormato;
			jTtoolBarDetalleAuxiliarFormato=this.jInternalFrameDetalleFormFormato.jTtoolBarDetalleFormato;
		}
		
		final JMenuBar jmenuBarDetalleFormato=jmenuBarDetalleAuxiliarFormato;
		final JToolBar jTtoolBarDetalleFormato=jTtoolBarDetalleAuxiliarFormato;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormato;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormato;
			processRunnable.jTableDatos=jTableDatosFormato;
			processRunnable.jPanelCampos=jPanelCamposFormato;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormato;
			processRunnable.jPanelAcciones=jPanelAccionesFormato;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormato;
			
			
			processRunnable.jmenuBar=jmenuBarFormato;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormato;
			processRunnable.jTtoolBar=jTtoolBarFormato;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormato;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormato ,jPanelParametrosReportesFormato,jTableDatosFormato, /*jScrollPanelDatosFormato,*/jPanelCamposFormato,jPanelPaginacionFormato, /*jScrollPanelDatosEdicionFormato,*/ jPanelAccionesFormato,jPanelAccionesFormularioFormato,jmenuBarFormato,jmenuBarDetalleFormato,jTtoolBarFormato,jTtoolBarDetalleFormato);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormato ,jPanelParametrosReportesFormato, jScrollPanelDatosFormato,jPanelPaginacionFormato, jScrollPanelDatosEdicionFormato, jPanelAccionesFormato,jPanelAccionesFormularioFormato,jmenuBarFormato,jmenuBarDetalleFormato,jTtoolBarFormato,jTtoolBarDetalleFormato);
						
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
	
	public void finishProcessFormato() {// throws Exception 
		this.finishProcessFormato(true);
	}
	
	public void finishProcessFormato(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFormato ,this.jPanelParametrosReportesFormato, this.jScrollPanelDatosFormato,this.jPanelPaginacionFormato, this.jScrollPanelDatosEdicionFormato, this.jPanelAccionesFormato,this.jPanelAccionesFormularioFormato,this.jmenuBarFormato,this.jmenuBarDetalleFormato,this.jTtoolBarFormato,this.jTtoolBarDetalleFormato);		
		
		final JTabbedPane jTabbedPaneBusquedasFormato=this.jTabbedPaneBusquedasFormato; 
		
		final JPanel jPanelParametrosReportesFormato=this.jPanelParametrosReportesFormato;
		//final JScrollPane jScrollPanelDatosFormato=this.jScrollPanelDatosFormato;
		final JTable jTableDatosFormato=this.jTableDatosFormato;		
		final JPanel jPanelPaginacionFormato=this.jPanelPaginacionFormato;
		//final JScrollPane jScrollPanelDatosEdicionFormato=this.jScrollPanelDatosEdicionFormato;
		final JPanel jPanelAccionesFormato=this.jPanelAccionesFormato;
		
		JPanel jPanelCamposAuxiliarFormato=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFormato=new JPanel();
		
		if(this.jInternalFrameDetalleFormFormato!=null) {
			jPanelCamposAuxiliarFormato=this.jInternalFrameDetalleFormFormato.jPanelCamposFormato;
			jPanelAccionesFormularioAuxiliarFormato=this.jInternalFrameDetalleFormFormato.jPanelAccionesFormularioFormato;
		}
		
		final JPanel jPanelCamposFormato=jPanelCamposAuxiliarFormato;
		final JPanel jPanelAccionesFormularioFormato=jPanelAccionesFormularioAuxiliarFormato;
		
		
		final JMenuBar jmenuBarFormato=this.jmenuBarFormato;		
		final JToolBar jTtoolBarFormato=this.jTtoolBarFormato;
				
		JMenuBar jmenuBarDetalleAuxiliarFormato=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormato=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFormato!=null) {
			jmenuBarDetalleAuxiliarFormato=this.jInternalFrameDetalleFormFormato.jmenuBarDetalleFormato;
			jTtoolBarDetalleAuxiliarFormato=this.jInternalFrameDetalleFormFormato.jTtoolBarDetalleFormato;		
		}
		
		final JMenuBar jmenuBarDetalleFormato=jmenuBarDetalleAuxiliarFormato;
		final JToolBar jTtoolBarDetalleFormato=jTtoolBarDetalleAuxiliarFormato;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormato;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormato;
			processRunnable.jTableDatos=jTableDatosFormato;
			processRunnable.jPanelCampos=jPanelCamposFormato;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormato;
			processRunnable.jPanelAcciones=jPanelAccionesFormato;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormato;
			
			
			processRunnable.jmenuBar=jmenuBarFormato;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormato;
			processRunnable.jTtoolBar=jTtoolBarFormato;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormato;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFormato ,jPanelParametrosReportesFormato, jTableDatosFormato,/*jScrollPanelDatosFormato,*/jPanelCamposFormato,jPanelPaginacionFormato, /*jScrollPanelDatosEdicionFormato,*/ jPanelAccionesFormato,jPanelAccionesFormularioFormato,jmenuBarFormato,jmenuBarDetalleFormato,jTtoolBarFormato,jTtoolBarDetalleFormato));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFormato(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFormato(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFormato(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFormato(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFormato,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFormato,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFormato(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFormato,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFormato,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.formatoConstantesFunciones.getsFinalQueryFormato();
		String  finalQueryPaginacionTodos=this.formatoConstantesFunciones.getsFinalQueryFormato();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FormatoConstantesFunciones.getArrayColumnasGlobalesNoFormato(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.formatosEliminados= new ArrayList<Formato>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFormato();
		
				///*FormatoSessionBean*/this.formatoSessionBean=new FormatoSessionBean();
			
			if(this.formatoSessionBean==null) {
				this.formatoSessionBean=new FormatoSessionBean();
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
					this.iNumeroPaginacion=FormatoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FormatoConstantesFunciones.getClassesForeignKeysOfFormato(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/formato."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			formatosAux= new ArrayList<Formato>();
			
				
			formatoLogic.setDatosCliente(this.datosCliente);
			formatoLogic.setDatosDeep(this.datosDeep);
			formatoLogic.setIsConDeep(true);
			
			
			formatoLogic.getFormatoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					formatoLogic.getTodosFormatos(finalQueryGlobal,pagination);
					
					//formatoLogic.getTodosFormatosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(formatoLogic.getFormatos()==null|| formatoLogic.getFormatos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formatosAux= new ArrayList<Formato>();
							formatosAux.addAll(formatoLogic.getFormatos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatosAux= new ArrayList<Formato>();
							formatosAux.addAll(formatos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formatoLogic.getTodosFormatos(finalQueryGlobal+"",this.pagination);												
							
							//formatoLogic.getTodosFormatosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFormatos("Todos",formatoLogic.getFormatos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formatoLogic.setFormatos(new ArrayList<Formato>());					
							formatoLogic.getFormatos().addAll(formatosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatos=new ArrayList<Formato>();
							formatos.addAll(formatosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFormato=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFormato=this.idActual;
				
				} else if(this.idFormatoActual!=null && this.idFormatoActual!=0L) {
					idFormato=idFormatoActual;
				}
				
					
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndicePorId(idFormato);
				
				this.formatos=new ArrayList<Formato>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					formatoLogic.getEntity(idFormato);
					
					//formatoLogic.getEntityWithConnection(idFormato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.setFormatos(new ArrayList<Formato>());
					formatoLogic.getFormatos().add(formatoLogic.getFormato());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatos=new ArrayList<Formato>();
					this.formatos.add(formato);
				}
				
				if(formatoLogic.getFormato()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatoLogic.getFormatosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatoLogic.getFormatos()==null||formatoLogic.getFormatos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatos==null|| formatos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatosAux=new ArrayList<Formato>();
						formatosAux.addAll(formatoLogic.getFormatos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatosAux=new ArrayList<Formato>();
							formatosAux.addAll(formatos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatoLogic.getFormatosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatos("BusquedaPorNombre",formatoLogic.getFormatos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatos("BusquedaPorNombre",formatos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoLogic.setFormatos(new ArrayList<Formato>());
						formatoLogic.getFormatos().addAll(formatosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatos=new ArrayList<Formato>();
							formatos.addAll(formatosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatoLogic.getFormatosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatoLogic.getFormatos()==null||formatoLogic.getFormatos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatos==null|| formatos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatosAux=new ArrayList<Formato>();
						formatosAux.addAll(formatoLogic.getFormatos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatosAux=new ArrayList<Formato>();
							formatosAux.addAll(formatos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatoLogic.getFormatosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatos("FK_IdEmpresa",formatoLogic.getFormatos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatos("FK_IdEmpresa",formatos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoLogic.setFormatos(new ArrayList<Formato>());
						formatoLogic.getFormatos().addAll(formatosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatos=new ArrayList<Formato>();
							formatos.addAll(formatosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatoLogic.getFormatosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatoLogic.getFormatos()==null||formatoLogic.getFormatos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatos==null|| formatos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatosAux=new ArrayList<Formato>();
						formatosAux.addAll(formatoLogic.getFormatos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatosAux=new ArrayList<Formato>();
							formatosAux.addAll(formatos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatoLogic.getFormatosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatos("FK_IdModulo",formatoLogic.getFormatos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatos("FK_IdModulo",formatos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoLogic.setFormatos(new ArrayList<Formato>());
						formatoLogic.getFormatos().addAll(formatosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatos=new ArrayList<Formato>();
							formatos.addAll(formatosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoFormato")) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdTipoFormato(id_tipo_formatoFK_IdTipoFormato);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatoLogic.getFormatosFK_IdTipoFormato(finalQueryGlobal,pagination,id_tipo_formatoFK_IdTipoFormato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdTipoFormato(id_tipo_formatoFK_IdTipoFormato);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdTipoFormato(id_tipo_formatoFK_IdTipoFormato);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatoLogic.getFormatos()==null||formatoLogic.getFormatos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatos==null|| formatos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatosAux=new ArrayList<Formato>();
						formatosAux.addAll(formatoLogic.getFormatos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatosAux=new ArrayList<Formato>();
							formatosAux.addAll(formatos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatoLogic.getFormatosFK_IdTipoFormato(finalQueryGlobal,pagination,id_tipo_formatoFK_IdTipoFormato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdTipoFormato(id_tipo_formatoFK_IdTipoFormato);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdTipoFormato(id_tipo_formatoFK_IdTipoFormato);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatos("FK_IdTipoFormato",formatoLogic.getFormatos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatos("FK_IdTipoFormato",formatos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoLogic.setFormatos(new ArrayList<Formato>());
						formatoLogic.getFormatos().addAll(formatosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatos=new ArrayList<Formato>();
							formatos.addAll(formatosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoMovimiento")) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatoLogic.getFormatosFK_IdTipoMovimiento(finalQueryGlobal,pagination,id_tipo_movimientoFK_IdTipoMovimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatoLogic.getFormatos()==null||formatoLogic.getFormatos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatos==null|| formatos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatosAux=new ArrayList<Formato>();
						formatosAux.addAll(formatoLogic.getFormatos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatosAux=new ArrayList<Formato>();
							formatosAux.addAll(formatos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatoLogic.getFormatosFK_IdTipoMovimiento(finalQueryGlobal,pagination,id_tipo_movimientoFK_IdTipoMovimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatos("FK_IdTipoMovimiento",formatoLogic.getFormatos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatos("FK_IdTipoMovimiento",formatos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoLogic.setFormatos(new ArrayList<Formato>());
						formatoLogic.getFormatos().addAll(formatosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatos=new ArrayList<Formato>();
							formatos.addAll(formatosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFormato();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFormato();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formatoLogic.getFormatos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formatos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formatoLogic.getFormatos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formatos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Formato formato) {
		Boolean permite=true;
		
		if(this.formato.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FormatoConstantesFunciones.getOrderByListaFormato();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FormatoConstantesFunciones.getOrderByListaFormato();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Formato formato:formatoLogic.getFormatos()) {
				if(formato.getsType().equals(Constantes2.S_TOTALES)) {
					formatoTotales=formato;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Formato formato:this.formatos) {
				if(formato.getsType().equals(Constantes2.S_TOTALES)) {
					formatoTotales=formato;
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
			this.formatoAux=new Formato();
			this.formatoAux.setsType(Constantes2.S_TOTALES);
			this.formatoAux.setIsNew(false);
			this.formatoAux.setIsChanged(false);
			this.formatoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FormatoConstantesFunciones.TotalizarValoresFilaFormato(this.formatoLogic.getFormatos(),this.formatoAux);
				
				this.formatoLogic.getFormatos().add(this.formatoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FormatoConstantesFunciones.TotalizarValoresFilaFormato(this.formatos,this.formatoAux);
				
				this.formatos.add(this.formatoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		formatoTotales=new Formato();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formatoLogic.getFormatos().remove(formatoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formatos.remove(formatoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		formatoTotales=new Formato();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Formato formato:formatoLogic.getFormatos()) {
				if(formato.getsType().equals(Constantes2.S_TOTALES)) {
					formatoTotales=formato;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormatoConstantesFunciones.TotalizarValoresFilaFormato(this.formatoLogic.getFormatos(),formatoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Formato formato:this.formatos) {
				if(formato.getsType().equals(Constantes2.S_TOTALES)) {
					formatoTotales=formato;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormatoConstantesFunciones.TotalizarValoresFilaFormato(this.formatos,formatoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFormatosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatosFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatosFK_IdTipoFormato()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoFormato";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatosFK_IdTipoMovimiento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMovimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatoPorEmpresaPorModuloPorTipoFormato()throws Exception {
		try {
			sAccionBusqueda="PorEmpresaPorModuloPorTipoFormato";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getFormatosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getFormatosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getFormatosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatosFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getFormatosFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatosFK_IdTipoFormato(String sFinalQuery,Long id_tipo_formato)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getFormatosFK_IdTipoFormato(sFinalQuery,this.pagination,id_tipo_formato);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatosFK_IdTipoMovimiento(String sFinalQuery,Long id_tipo_movimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getFormatosFK_IdTipoMovimiento(sFinalQuery,this.pagination,id_tipo_movimiento);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatoPorEmpresaPorModuloPorTipoFormato(Long id_empresa,Long id_modulo,Long id_tipo_formato)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getFormatoPorEmpresaPorModuloPorTipoFormato(id_empresa,id_modulo,id_tipo_formato);
				
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
	
	public void inicializarPermisosFormato() {
		this.isPermisoTodoFormato=false;
		this.isPermisoNuevoFormato=false;
		this.isPermisoActualizarFormato=false;
		this.isPermisoActualizarOriginalFormato=false;
		this.isPermisoEliminarFormato=false;
		this.isPermisoGuardarCambiosFormato=false;
		this.isPermisoConsultaFormato=false;
		this.isPermisoBusquedaFormato=false;
		this.isPermisoReporteFormato=false;		
		this.isPermisoOrdenFormato=false;		
		this.isPermisoPaginacionMedioFormato=false;		
		this.isPermisoPaginacionAltoFormato=false;
		this.isPermisoPaginacionTodoFormato=false;
		this.isPermisoCopiarFormato=false;		
		this.isPermisoVerFormFormato=false;		
		this.isPermisoDuplicarFormato=false;		
		this.isPermisoOrdenFormato=false;		
	}
	
	public void setPermisosUsuarioFormato(Boolean isPermiso) {
		this.isPermisoTodoFormato=isPermiso;
		this.isPermisoNuevoFormato=isPermiso;
		this.isPermisoActualizarFormato=isPermiso;
		this.isPermisoActualizarOriginalFormato=isPermiso;
		this.isPermisoEliminarFormato=isPermiso;
		this.isPermisoGuardarCambiosFormato=isPermiso;
		this.isPermisoConsultaFormato=isPermiso;
		this.isPermisoBusquedaFormato=isPermiso;
		this.isPermisoReporteFormato=isPermiso;
		this.isPermisoOrdenFormato=isPermiso;		
		this.isPermisoPaginacionMedioFormato=isPermiso;		
		this.isPermisoPaginacionAltoFormato=isPermiso;		
		this.isPermisoPaginacionTodoFormato=isPermiso;		
		this.isPermisoCopiarFormato=isPermiso;		
		this.isPermisoVerFormFormato=isPermiso;		
		this.isPermisoDuplicarFormato=isPermiso;
		this.isPermisoOrdenFormato=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFormato(Boolean isPermiso) {
		//this.isPermisoTodoFormato=isPermiso;
		this.isPermisoNuevoFormato=isPermiso;
		this.isPermisoActualizarFormato=isPermiso;
		this.isPermisoActualizarOriginalFormato=isPermiso;
		this.isPermisoEliminarFormato=isPermiso;
		this.isPermisoGuardarCambiosFormato=isPermiso;
		//this.isPermisoConsultaFormato=isPermiso;
		//this.isPermisoBusquedaFormato=isPermiso;
		//this.isPermisoReporteFormato=isPermiso;
		//this.isPermisoOrdenFormato=isPermiso;		
		//this.isPermisoPaginacionMedioFormato=isPermiso;		
		//this.isPermisoPaginacionAltoFormato=isPermiso;		
		//this.isPermisoPaginacionTodoFormato=isPermiso;		
		//this.isPermisoCopiarFormato=isPermiso;		
		//this.isPermisoDuplicarFormato=isPermiso;
		//this.isPermisoOrdenFormato=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFormatoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(FormatoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebFormato(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFormatoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioFormatoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFormatoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFormatoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioFormato() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FormatoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.formatoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FormatoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFormato=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFormato=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFormato=this.isPermisoActualizarFormato;
			this.isPermisoEliminarFormato=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFormato=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFormato=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFormato=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFormato=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFormato=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormato=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFormato=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFormato=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFormato=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFormato=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFormato=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFormato=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormato=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.formatoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFormato.setToolTipText(this.jTableDatosFormato.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFormato(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFormato(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FormatoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FormatoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFormato() throws Exception {
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
	public void inicializarCombosForeignKeyFormatoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.tipomovimientosForeignKey=new ArrayList();
				this.tipoformatosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFormatoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FormatoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFormatoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoMovimientoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipomovimientosForeignKey==null||this.tipomovimientosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoMovimientoConstantesFunciones.getArrayColumnasGlobalesTipoMovimiento(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoMovimientoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoMovimientosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoFormatoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoformatosForeignKey==null||this.tipoformatosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoFormatoConstantesFunciones.getArrayColumnasGlobalesTipoFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFormatoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoFormatoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoFormatosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyFormatoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			FormatoParameterReturnGeneral formatoReturnGeneral=new FormatoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.formatoConstantesFunciones.cargarid_empresaFormato)
					 || (this.esRecargarFks && this.formatoConstantesFunciones.cargarid_empresaFormato)) {

					if(!this.formatoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+formatoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.formatoConstantesFunciones.cargarid_moduloFormato)
					 || (this.esRecargarFks && this.formatoConstantesFunciones.cargarid_moduloFormato)) {

					if(!this.formatoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+formatoSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalTipoMovimiento="";

				if(((this.tipomovimientosForeignKey==null||this.tipomovimientosForeignKey.size()<=0) && this.formatoConstantesFunciones.cargarid_tipo_movimientoFormato)
					 || (this.esRecargarFks && this.formatoConstantesFunciones.cargarid_tipo_movimientoFormato)) {

					if(!this.formatoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoMovimientoConstantesFunciones.getArrayColumnasGlobalesTipoMovimiento(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoMovimiento=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoMovimiento=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoMovimiento, "");
						finalQueryGlobalTipoMovimiento+=TipoMovimientoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoMovimientosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoMovimiento=" WHERE " + ConstantesSql.ID + "="+formatoSessionBean.getlidTipoMovimientoActual();
					}
				} else {
					finalQueryGlobalTipoMovimiento="NONE";
				}


				String finalQueryGlobalTipoFormato="";

				if(((this.tipoformatosForeignKey==null||this.tipoformatosForeignKey.size()<=0) && this.formatoConstantesFunciones.cargarid_tipo_formatoFormato)
					 || (this.esRecargarFks && this.formatoConstantesFunciones.cargarid_tipo_formatoFormato)) {

					if(!this.formatoSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormato()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoFormatoConstantesFunciones.getArrayColumnasGlobalesTipoFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoFormato=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFormatoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoFormato=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoFormato, "");
						finalQueryGlobalTipoFormato+=TipoFormatoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoFormatosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoFormato=" WHERE " + ConstantesSql.ID + "="+formatoSessionBean.getlidTipoFormatoActual();
					}
				} else {
					finalQueryGlobalTipoFormato="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				formatoReturnGeneral=formatoLogic.cargarCombosLoteForeignKeyFormato(finalQueryGlobalEmpresa,finalQueryGlobalModulo,finalQueryGlobalTipoMovimiento,finalQueryGlobalTipoFormato);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=formatoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=formatoReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalTipoMovimiento.equals("NONE")) {
				this.tipomovimientosForeignKey=formatoReturnGeneral.gettipomovimientosForeignKey();
			}

			if(!finalQueryGlobalTipoFormato.equals("NONE")) {
				this.tipoformatosForeignKey=formatoReturnGeneral.gettipoformatosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFormato()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyTipoMovimiento();
			this.addItemDefectoCombosForeignKeyTipoFormato();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.formatoSessionBean==null) {
				this.formatoSessionBean=new FormatoSessionBean();
			}

			if(!this.formatoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.formatoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoMovimiento()throws Exception {
		try {

			if(!this.formatoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
				TipoMovimiento tipomovimiento=new TipoMovimiento();
				TipoMovimientoConstantesFunciones.setTipoMovimientoDescripcion(tipomovimiento,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipomovimiento.setId(null);

				if(!TipoMovimientoConstantesFunciones.ExisteEnLista(this.tipomovimientosForeignKey,tipomovimiento,true)) {

					this.tipomovimientosForeignKey.add(0,tipomovimiento);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoFormato()throws Exception {
		try {

			if(!this.formatoSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormato()) {
				TipoFormato tipoformato=new TipoFormato();
				TipoFormatoConstantesFunciones.setTipoFormatoDescripcion(tipoformato,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoformato.setId(null);

				if(!TipoFormatoConstantesFunciones.ExisteEnLista(this.tipoformatosForeignKey,tipoformato,true)) {

					this.tipoformatosForeignKey.add(0,tipoformato);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyFormato()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFormato(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFormato()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormato();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFormato(Formato formato)throws Exception {	
		try {
			
			this.setActualModuloForeignKey(formato.getid_modulo(),false,"Formulario");
			this.setActualTipoMovimientoForeignKey(formato.getid_tipo_movimiento(),false,"Formulario");
			this.setActualTipoFormatoForeignKey(formato.getid_tipo_formato(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFormato(Formato formato,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFormato()throws Exception {	
		try {
			
			this.setActualModuloForeignKey(this.formatoConstantesFunciones.getid_modulo(),false,"Formulario");
			this.setActualTipoMovimientoForeignKey(this.formatoConstantesFunciones.getid_tipo_movimiento(),false,"Formulario");
			this.setActualTipoFormatoForeignKey(this.formatoConstantesFunciones.getid_tipo_formato(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFormato()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFormato()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFormato()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFormato()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFormato()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameTipoMovimientosForeignKey("Todos");
			this.cargarCombosFrameTipoFormatosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFormato(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoFormatosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFormato()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFormato.jComboBoxid_empresaFormato!=null && this.jInternalFrameDetalleFormFormato.jComboBoxid_empresaFormato.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormato.jComboBoxid_empresaFormato.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormato.jComboBoxid_moduloFormato!=null && this.jInternalFrameDetalleFormFormato.jComboBoxid_moduloFormato.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormato.jComboBoxid_moduloFormato.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_movimientoFormato!=null && this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_movimientoFormato.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_movimientoFormato.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_formatoFormato!=null && this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_formatoFormato.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_formatoFormato.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public FormatoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FormatoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FormatoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.formatoSessionBean=new FormatoSessionBean(); 
		this.formatoConstantesFunciones=new FormatoConstantesFunciones(); 
		this.formatoBean=new Formato();//(this.formatoConstantesFunciones); 		
		this.formatoReturnGeneral=new FormatoParameterReturnGeneral(); 
		
		this.formatoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formatoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FormatoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FormatoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FormatoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFormato(true);
			
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
			
			this.formatoConstantesFunciones=new FormatoConstantesFunciones(); 
			this.formatoBean=new Formato();//this.formatoConstantesFunciones); 			
			this.formatoReturnGeneral=new FormatoParameterReturnGeneral(); 
		
			FormatoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formato Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.formato=new Formato();
			this.formatos = new ArrayList<Formato>();
			this.formatosAux = new ArrayList<Formato>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic=new FormatoLogic();
				this.formatoLogic.getNewConnexionToDeep("");
			}
			
			//this.formatoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.formatoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFormato);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFormato!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormato);	
					}
					
					if(this.jInternalFrameImportacionFormato!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormato);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFormato!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFormato);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFormato!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFormato);
				this.jInternalFrameDetalleFormFormato.setVisible(false);
				this.jInternalFrameDetalleFormFormato.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFormato!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormato);
					this.jInternalFrameReporteDinamicoFormato.setVisible(false);
					this.jInternalFrameReporteDinamicoFormato.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFormato!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFormato);
					this.jInternalFrameImportacionFormato.setVisible(false);
					this.jInternalFrameImportacionFormato.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFormato!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFormato);
					this.jInternalFrameOrderByFormato.setVisible(false);
					this.jInternalFrameOrderByFormato.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFormatoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FormatoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.formatoReturnGeneral=new FormatoParameterReturnGeneral();
			
			this.formatoParameterGeneral=new FormatoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.formatoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.formatoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FormatoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.formatoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormatoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formatoSessionBean.getEsGuardarRelacionado(),this.formatoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormatoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formatoSessionBean.getEsGuardarRelacionado(),this.formatoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFormato=false;
			this.isVisibilidadCeldaDuplicarFormato=true;
			this.isVisibilidadCeldaCopiarFormato=true;
			this.isVisibilidadCeldaVerFormFormato=true;
			this.isVisibilidadCeldaOrdenFormato=true;
			this.isVisibilidadCeldaNuevoRelacionesFormato=false;
			this.isVisibilidadCeldaModificarFormato=false;
			this.isVisibilidadCeldaActualizarFormato=false;
			this.isVisibilidadCeldaEliminarFormato=false;
			this.isVisibilidadCeldaCancelarFormato=false;
			this.isVisibilidadCeldaGuardarFormato=false;
			this.isVisibilidadCeldaGuardarCambiosFormato=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdTipoFormato=true;
			this.isVisibilidadFK_IdTipoMovimiento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFormato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFormato();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFormato(false);
			
			this.setPermisosUsuarioFormato();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formatoSessionBean.getEsGuardarRelacionado() 
				|| (this.formatoSessionBean.getEsGuardarRelacionado() && this.formatoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFormatoClasesRelacionadas();
			}
			
			if(this.formatoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFormatoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FormatoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFormato();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFormato();
			}
			
			if(!this.isPermisoBusquedaFormato) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFormato.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formatoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFormato,this.isPermisoPaginacionMedioFormato,this.isPermisoPaginacionTodoFormato);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FormatoConstantesFunciones.getTiposSeleccionarFormato());
				
				this.tiposColumnasSelect=FormatoConstantesFunciones.getTiposSeleccionarFormato(true);
				
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
			//if(!this.formatoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFormato();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioFormato(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioFormato(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFormato() ;
			
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
			this.moduloLogic=new ModuloLogic();
			this.tipomovimientoLogic=new TipoMovimientoLogic();
			this.tipoformatoLogic=new TipoFormatoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				formatoImplementable= (FormatoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormatoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				formatoImplementableHome= (FormatoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormatoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.formatos= new ArrayList<Formato>();
			this.formatosEliminados= new ArrayList<Formato>();
						
			this.isEsNuevoFormato=false;
			this.esParaAccionDesdeFormularioFormato=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>() ;
			this.tipoformatosForeignKey=new ArrayList<TipoFormato>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFormato(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFormato();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formatoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FormatoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FormatoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFormato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFormato(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFormato!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFormato();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFormato();
			}
			
			FormatoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFormato.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFormato.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFormato.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFormato(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Formato: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFormato() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFormato")) {
				iIndex=this.jInternalFrameDetalleFormFormato.jTabbedPaneRelacionesFormato.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFormato.jTabbedPaneRelacionesFormato.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFormato.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFormato();	
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
	
	public void cargarCombosForeignKeyFormato(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFormato(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFormato(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFormatoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFormato();
		
		this.cargarCombosFrameForeignKeyFormato();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFormato();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFormato();
		}
	}
	
	

	public void cargarCombosForeignKeyModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaModulo(this.modulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoMovimiento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoMovimiento(this.tipomovimientosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoFormato(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoFormato();
				this.cargarCombosFrameTipoFormatosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoFormato(this.tipoformatosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoFormatoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.formatoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFormato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
			
			
			if(jTableDatosFormato.getRowCount()>=1) {
				jTableDatosFormato.removeRowSelectionInterval(0, jTableDatosFormato.getRowCount()-1);						
			}
			
			this.isEsNuevoFormato=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFormato(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFormato(true);			
			//this.formato=new Formato();
			//this.formato.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormato(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormato() ;
			
			if(FormatoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormato(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.formato);	
			this.actualizarInformacion("INFO_PADRE",false,this.formato);				
			
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
			
			if(this.formatoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Formato: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFormatoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Formato> formatosSeleccionados=new ArrayList<Formato>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFormato.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFormato.getSelectedRows().length;			
			}
			
			formatosSeleccionados=this.getFormatosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFormato--;			
				//Formato formatoAux= new Formato();			
				//formatoAux.setId(this.iIdNuevoFormato);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Formato formatoOrigen=new Formato();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Formato formatoOrigen : formatosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFormato.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							formatoOrigen =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatoOrigen =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFormato();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.formato.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFormato(formatoOrigen,this.formato,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formatoLogic.getFormatos().add(this.formatoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formatos.add(this.formatoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFormato(false);
				
				this.jTableDatosFormato.setRowSelectionInterval(this.getIndiceNuevoFormato(), this.getIndiceNuevoFormato());
				
				int iLastRow =  this.jTableDatosFormato.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormato.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormato.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormato(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Formato> formatosSeleccionados=new ArrayList<Formato>();									
		
			Formato formatoOrigen=new Formato();
			Formato formatoDestino=new Formato();
				
			formatosSeleccionados=this.getFormatosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFormato.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || formatosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFormato.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoOrigen =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formatoOrigen =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatoDestino =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formatoDestino =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				formatoOrigen =formatosSeleccionados.get(0);
				formatoDestino =formatosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFormato(formatoOrigen,formatoDestino,true,false);
				
				formatoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formatoDestino,formatoLogic.getFormatos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatoDestino,formatos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFormato(false);
				
				//this.jTableDatosFormato.setRowSelectionInterval(this.getIndiceNuevoFormato(), this.getIndiceNuevoFormato());
				
				int iLastRow =  this.jTableDatosFormato.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormato.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormato.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormato(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFormato.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFormato.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFormato.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFormato.setVisible(!isVisible);
			this.jPanelPaginacionFormato.setVisible(!isVisible);
			this.jPanelAccionesFormato.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFormato();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFormato();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFormato();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFormato();
			
			this.abrirFrameOrderByFormato();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFormato();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFormato(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormato);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFormato.isMaximum()) {
					this.jInternalFrameDetalleFormFormato.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFormato.setSize(this.jInternalFrameDetalleFormFormato.iWidthFormulario,this.jInternalFrameDetalleFormFormato.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFormato.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFormato.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFormato.isMaximum()) {
						this.jInternalFrameDetalleFormFormato.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFormato.jContentPaneDetalleFormato.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFormato.jTabbedPaneRelacionesFormato.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFormato.jContentPaneDetalleFormato.getWidth(),FormatoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormato.jTabbedPaneRelacionesFormato.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFormato.jContentPaneDetalleFormato.getWidth(),FormatoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormato.jTabbedPaneRelacionesFormato.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFormato.jContentPaneDetalleFormato.getWidth(),FormatoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFormato.setVisible(true);
	        this.jInternalFrameDetalleFormFormato.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFormato() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFormato==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFormato=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormato,false,this);
				} else {
					this.jInternalFrameOrderByFormato=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormato,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFormato);
				this.jInternalFrameOrderByFormato.setVisible(false);
				this.jInternalFrameOrderByFormato.setSelected(false);
				
				this.jInternalFrameOrderByFormato.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormato"));
				
				this.inicializarActualizarBindingTablaOrderByFormato();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFormato() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFormato==null) {
				
				this.jInternalFrameImportacionFormato=new ImportacionJInternalFrame(FormatoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormato);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFormato);
				this.jInternalFrameImportacionFormato.setVisible(false);
				this.jInternalFrameImportacionFormato.setSelected(false);


				this.jInternalFrameImportacionFormato.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormato"));
				this.jInternalFrameImportacionFormato.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormato"));
				this.jInternalFrameImportacionFormato.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormato"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFormato() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFormato==null) {
				this.jInternalFrameReporteDinamicoFormato=new ReporteDinamicoJInternalFrame(FormatoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormato);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormato);
				this.jInternalFrameReporteDinamicoFormato.setVisible(false);
				this.jInternalFrameReporteDinamicoFormato.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFormato.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormato"));
				this.jInternalFrameReporteDinamicoFormato.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormato"));
				this.jInternalFrameReporteDinamicoFormato.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormato"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormato();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleFormato() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormato);
			
	       	this.jInternalFrameDetalleFormFormato.setVisible(false);
	        this.jInternalFrameDetalleFormFormato.setSelected(false);
			
			//this.jInternalFrameDetalleFormFormato.dispose();
			//this.jInternalFrameDetalleFormFormato=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFormato() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFormato.setVisible(true);
	        this.jInternalFrameReporteDinamicoFormato.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFormato() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFormato.setVisible(true);
	        this.jInternalFrameImportacionFormato.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFormato() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFormato.setVisible(true);
	        this.jInternalFrameOrderByFormato.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFormato() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFormato.setVisible(false);
	        this.jInternalFrameOrderByFormato.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFormato() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFormato.setVisible(false);
	        this.jInternalFrameReporteDinamicoFormato.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFormato() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFormato.setVisible(false);
	        this.jInternalFrameImportacionFormato.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFormato(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFormato(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormato.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFormato(true);
			//this.isEsNuevoFormato=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFormato("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormato(false) ;
			
			if(formatoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(FormatoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormato(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormato(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFormatoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFormato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFormato(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormato.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFormato(true);
			//this.isEsNuevoFormato=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.formato.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFormato("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFormato(false) ;
			
			if(FormatoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormato(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormato(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaModulo(List<Modulo> modulosForeignKey)throws Exception{
		TableColumn tableColumnModulo=this.jTableDatosFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormato,FormatoConstantesFunciones.LABEL_IDMODULO));
		TableCellEditor tableCellEditorModulo =tableColumnModulo.getCellEditor();

		ModuloTableCell moduloTableCellFk=(ModuloTableCell)tableCellEditorModulo;

		if(moduloTableCellFk!=null) {
			moduloTableCellFk.setmodulosForeignKey(modulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormato.getSelectedRow();

		//if(intSelectedRow<=0) {
			//moduloTableCellFk.setRowActual(intSelectedRow);
			//moduloTableCellFk.setmodulosForeignKeyActual(modulosForeignKey);
		//}


		if(moduloTableCellFk!=null) {
			moduloTableCellFk.RecargarModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoMovimiento(List<TipoMovimiento> tipomovimientosForeignKey)throws Exception{
		TableColumn tableColumnTipoMovimiento=this.jTableDatosFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormato,FormatoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));
		TableCellEditor tableCellEditorTipoMovimiento =tableColumnTipoMovimiento.getCellEditor();

		TipoMovimientoTableCell tipomovimientoTableCellFk=(TipoMovimientoTableCell)tableCellEditorTipoMovimiento;

		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.settipomovimientosForeignKey(tipomovimientosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormato.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomovimientoTableCellFk.setRowActual(intSelectedRow);
			//tipomovimientoTableCellFk.settipomovimientosForeignKeyActual(tipomovimientosForeignKey);
		//}


		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.RecargarTipoMovimientosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoFormato(List<TipoFormato> tipoformatosForeignKey)throws Exception{
		TableColumn tableColumnTipoFormato=this.jTableDatosFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormato,FormatoConstantesFunciones.LABEL_IDTIPOFORMATO));
		TableCellEditor tableCellEditorTipoFormato =tableColumnTipoFormato.getCellEditor();

		TipoFormatoTableCell tipoformatoTableCellFk=(TipoFormatoTableCell)tableCellEditorTipoFormato;

		if(tipoformatoTableCellFk!=null) {
			tipoformatoTableCellFk.settipoformatosForeignKey(tipoformatosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormato.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoformatoTableCellFk.setRowActual(intSelectedRow);
			//tipoformatoTableCellFk.settipoformatosForeignKeyActual(tipoformatosForeignKey);
		//}


		if(tipoformatoTableCellFk!=null) {
			tipoformatoTableCellFk.RecargarTipoFormatosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFormato(false);
			
			//if(!this.isEsNuevoFormato) {								
				int intSelectedRow = this.jTableDatosFormato.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFormato(this.formato,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
				
			}
			
			if(this.permiteMantenimiento(this.formato)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.formatoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFormato=true;
					this.inicializarActualizarBindingTablaFormato(false);
					this.isEsNuevoFormato=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFormato=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFormato=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormato(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormato(false);
				
				this.habilitarDeshabilitarControlesFormato(false);
			
												
				
				if(FormatoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFormato();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFormatoActionPerformed(evt,formatoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFormato(this.formato,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFormato.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,formatoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.formato.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Formato.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formato.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFormato.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				this.formato.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				this.formato.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.formato)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.formatoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FormatoModel) this.jTableDatosFormato.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFormato=true;
				this.inicializarActualizarBindingTablaFormato(false);
				this.isEsNuevoFormato=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormato(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormato(false);
				
				this.habilitarDeshabilitarControlesFormato(false);
				
				
				
				if(FormatoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFormato();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFormatoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFormato.getRowCount()>=1) {
				jTableDatosFormato.removeRowSelectionInterval(0, jTableDatosFormato.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFormato(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFormato(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormato(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormato(false) ;
			
			this.isEsNuevoFormato=false;
			
			if(FormatoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFormato();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFormatoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFormato(false);
				
				//SI ES MANUAL
				if(FormatoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFormato();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFormatoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFormato--;			
			//Formato formatoAux= new Formato();			
			//formatoAux.setId(this.iIdNuevoFormato);
			
			if(this.jInternalFrameDetalleFormFormato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFormato();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
			
			this.formato.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.formatoLogic.getFormatos().add(this.formatoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.formatos.add(this.formatoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFormato(false);
			
			this.jTableDatosFormato.setRowSelectionInterval(this.getIndiceNuevoFormato(), this.getIndiceNuevoFormato());
			
			int iLastRow =  this.jTableDatosFormato.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFormato.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFormato.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFormato(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFormatoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFormato(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormato(false);
			
			//SI ES MANUAL
			if(FormatoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormato();
			}
			
			//this.abrirFrameTreeFormato();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFormatoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE FormatoES ?", "MANTENIMIENTO DE Formato", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFormato.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFormato();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.formatoReturnGeneral=formatoLogic.procesarImportacionFormatosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.formatoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFormatoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFormatoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFormato.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFormato.setFileImportacion(this.jInternalFrameImportacionFormato.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFormato.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFormato.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFormato.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFormato.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFormatoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Formato> formatosSeleccionados=new ArrayList<Formato>();		

		formatosSeleccionados=this.getFormatosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormato.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormato.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FormatoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FormatoBaseDesign.jrxml";
			
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
			
			this.generarReporteFormatos("Todos",formatosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFormato.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormato.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormatoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoConstantesFunciones.LABEL_IDTIPOFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoFormato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoFormato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoFormato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoFormato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoConstantesFunciones.LABEL_UBICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_icacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_icacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_icacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_icacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFormato.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFormato.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFormato.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FormatoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case FormatoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case FormatoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case FormatoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					sNombreCampoCategoria="id_tipo_movimiento";
					break;

				case FormatoConstantesFunciones.LABEL_IDTIPOFORMATO:
					sNombreCampoCategoria="id_tipo_formato";
					break;

				case FormatoConstantesFunciones.LABEL_UBICACION:
					sNombreCampoCategoria="ubicacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFormato.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FormatoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case FormatoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case FormatoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case FormatoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="id_tipo_movimiento";
					break;

				case FormatoConstantesFunciones.LABEL_IDTIPOFORMATO:
					sNombreCampoCategoriaValor="id_tipo_formato";
					break;

				case FormatoConstantesFunciones.LABEL_UBICACION:
					sNombreCampoCategoriaValor="ubicacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFormato.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormato.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormatoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case FormatoConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case FormatoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case FormatoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_movimiento");
					break;

				case FormatoConstantesFunciones.LABEL_IDTIPOFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Formato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_formato");
					break;

				case FormatoConstantesFunciones.LABEL_UBICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ubicacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ubicacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoFormatoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Formato> formatosSeleccionados=new ArrayList<Formato>();		
		
		formatosSeleccionados=this.getFormatosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formato";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Formatos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFormato.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFormato.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FormatoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Formato formato:formatosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formato.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(Formato formato:formatosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formato.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Formato formato:formatosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formato.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
					iRow++;

					for(Formato formato:formatosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formato.gettipomovimiento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoConstantesFunciones.LABEL_IDTIPOFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoConstantesFunciones.LABEL_IDTIPOFORMATO);
					iRow++;

					for(Formato formato:formatosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formato.gettipoformato_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoConstantesFunciones.LABEL_UBICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoConstantesFunciones.LABEL_UBICACION);
					iRow++;

					for(Formato formato:formatosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formato.getubicacion());
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
			//	this.getFilaCabeceraExportarExcelFormato(row);				
			//	iRow++;
			//}				
			
			//for(Formato formatoAux:formatosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFormato(formatoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato",JOptionPane.INFORMATION_MESSAGE);
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
				this.formatoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormato(false);
			
			//SI ES MANUAL
			if(FormatoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormato();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFormatoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormato(false);
			
			//SI ES MANUAL
			if(FormatoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormato();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFormatoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormato(false);
			
			//SI ES MANUAL
			if(FormatoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormato();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFormato() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFormato.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFormato.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFormato.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFormato.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFormato.setMinimumSize(dimensionMinimum);
		this.jTableDatosFormato.setMaximumSize(dimensionMaximum);
		this.jTableDatosFormato.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFormato(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFormato(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFormato(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFormato(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFormato(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formatoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFormato(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormato(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFormato(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FormatoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FormatoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFormato() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFormato();
		
		this.inicializarActualizarBindingBotonesManualFormato(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formatoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFormato();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormato() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFormato(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFormato(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFormato.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFormato.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFormato.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFormato!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFormato.jCheckBoxPostAccionNuevoFormato.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFormato.jCheckBoxPostAccionSinCerrarFormato.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFormato.jCheckBoxPostAccionSinMensajeFormato.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFormato.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFormato.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFormato.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFormato!=null) {
				this.jInternalFrameDetalleFormFormato.jCheckBoxPostAccionNuevoFormato.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFormato.jCheckBoxPostAccionSinCerrarFormato.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFormato.jCheckBoxPostAccionSinMensajeFormato.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFormato.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFormato.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFormato!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFormato.jComboBoxTiposAccionesFormularioFormato.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFormato.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFormato!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormato.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFormato.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFormato.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFormato.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFormato.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFormato!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormato.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFormato.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFormato.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFormato(Boolean esInicializar) throws Exception {
		try	{	
			if(FormatoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFormato(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFormato() throws Exception {
		try	{
			if(FormatoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormato();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormato() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFormato.jComboBoxTiposAccionesFormularioFormato.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFormato.jComboBoxTiposAccionesFormularioFormato.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormato() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFormato.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFormato.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFormato.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFormato.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFormato.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFormato.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFormato.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFormato.addItem(reporte);
			}
			
			
			if(!this.formatoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFormato.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFormato.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFormato.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFormato.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFormato.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFormato.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFormato.jComboBoxTiposAccionesFormularioFormato.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFormato.jComboBoxTiposAccionesFormularioFormato.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFormato.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFormato.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFormato.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormato();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormato() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormato!=null) {
				this.jInternalFrameReporteDinamicoFormato.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormato.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormato!=null) {
				this.jInternalFrameReporteDinamicoFormato.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormato.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFormato!=null) {
				
				if(this.jInternalFrameReporteDinamicoFormato.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormato.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormato.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFormato.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormato.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormato.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFormato()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombreFormato.getText();
		if(this.jComboBoxid_moduloFK_IdModuloFormato.getSelectedItem()!=null){this.id_moduloFK_IdModulo=((Modulo)this.jComboBoxid_moduloFK_IdModuloFormato.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato.getSelectedItem()!=null){this.id_tipo_formatoFK_IdTipoFormato=((TipoFormato)this.jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato.getSelectedItem()!=null){this.id_tipo_movimientoFK_IdTipoMovimiento=((TipoMovimiento)this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFormato(Boolean esInicializar) throws Exception {				
		if(FormatoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFormato();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFormato() throws Exception {
		this.inicializarActualizarBindingTablaFormato(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFormato() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFormato.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFormato.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormato.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FormatoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFormato.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormato.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FormatoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFormatoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FormatoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFormato.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormato.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FormatoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFormato.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFormato(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=formatoLogic.getFormatos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=formatos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFormato.setModel(new FormatoModel(this.formatoLogic.getFormatos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFormato.setModel(new FormatoModel(this.formatos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFormato!=null && this.jInternalFrameOrderByFormato.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFormato();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormato,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FormatoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FormatoConstantesFunciones.SCLASSWEBTITULO,formatoConstantesFunciones.resaltarSeleccionarFormato,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FormatoConstantesFunciones.SCLASSWEBTITULO,formatoConstantesFunciones.resaltarSeleccionarFormato,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormato,FormatoConstantesFunciones.LABEL_ID));

		if(this.formatoConstantesFunciones.mostraridFormato && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formatoConstantesFunciones.resaltaridFormato,this.formatoConstantesFunciones.activaridFormato,this,true,"idFormato","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formatoConstantesFunciones.resaltaridFormato,this.formatoConstantesFunciones.activaridFormato,this,true,"idFormato","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormato,FormatoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.formatoConstantesFunciones.mostrarid_empresaFormato && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.formatoConstantesFunciones.resaltarid_empresaFormato,this,this.formatoConstantesFunciones.activarid_empresaFormato));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.formatoConstantesFunciones.resaltarid_empresaFormato,this,this.formatoConstantesFunciones.activarid_empresaFormato,false,"id_empresaFormato","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormato,FormatoConstantesFunciones.LABEL_IDMODULO));

		if(this.formatoConstantesFunciones.mostrarid_moduloFormato && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.formatoConstantesFunciones.resaltarid_moduloFormato,this,this.formatoConstantesFunciones.activarid_moduloFormato));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.formatoConstantesFunciones.resaltarid_moduloFormato,this,this.formatoConstantesFunciones.activarid_moduloFormato,true,"id_moduloFormato","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new FormatoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormato,FormatoConstantesFunciones.LABEL_NOMBRE));

		if(this.formatoConstantesFunciones.mostrarnombreFormato && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.formatoConstantesFunciones.resaltarnombreFormato,this.formatoConstantesFunciones.activarnombreFormato,this,true,"nombreFormato","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formatoConstantesFunciones.resaltarnombreFormato,this.formatoConstantesFunciones.activarnombreFormato,this,true,"nombreFormato","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new FormatoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormato,FormatoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));

		if(this.formatoConstantesFunciones.mostrarid_tipo_movimientoFormato && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoMovimientoTableCell(this.tipomovimientosForeignKey,this.formatoConstantesFunciones.resaltarid_tipo_movimientoFormato,this,this.formatoConstantesFunciones.activarid_tipo_movimientoFormato));
			tableColumn.setCellEditor(new TipoMovimientoTableCell(this.tipomovimientosForeignKey,this.formatoConstantesFunciones.resaltarid_tipo_movimientoFormato,this,this.formatoConstantesFunciones.activarid_tipo_movimientoFormato,true,"id_tipo_movimientoFormato","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormato,FormatoConstantesFunciones.LABEL_IDTIPOFORMATO));

		if(this.formatoConstantesFunciones.mostrarid_tipo_formatoFormato && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoConstantesFunciones.LABEL_IDTIPOFORMATO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoFormatoTableCell(this.tipoformatosForeignKey,this.formatoConstantesFunciones.resaltarid_tipo_formatoFormato,this,this.formatoConstantesFunciones.activarid_tipo_formatoFormato));
			tableColumn.setCellEditor(new TipoFormatoTableCell(this.tipoformatosForeignKey,this.formatoConstantesFunciones.resaltarid_tipo_formatoFormato,this,this.formatoConstantesFunciones.activarid_tipo_formatoFormato,true,"id_tipo_formatoFormato","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new FormatoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormato,FormatoConstantesFunciones.LABEL_UBICACION));

		if(this.formatoConstantesFunciones.mostrarubicacionFormato && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoConstantesFunciones.LABEL_UBICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.formatoConstantesFunciones.resaltarubicacionFormato,this.formatoConstantesFunciones.activarubicacionFormato,this,true,"ubicacionFormato","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formatoConstantesFunciones.resaltarubicacionFormato,this.formatoConstantesFunciones.activarubicacionFormato,this,true,"ubicacionFormato","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.formatoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formatoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formatoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormato.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formatoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formatoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormato.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFormato && this.isPermisoGuardarCambiosFormato) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.formatoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.formatoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFormato.addColumn(tableColumn);
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
			
			this.jTableDatosFormato.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormato && this.isPermisoGuardarCambiosFormato) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormato && this.isPermisoGuardarCambiosFormato) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFormato.moveColumn(this.jTableDatosFormato.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFormato.moveColumn(this.jTableDatosFormato.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFormato.moveColumn(this.jTableDatosFormato.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFormato.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFormato.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFormato,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFormato.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFormato.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFormato.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFormato.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFormato.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=formatoLogic.getFormatos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=formatos.size()-1;
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
		//this.jTableDatosFormato.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFormato();
			
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
				
				//this.isEsNuevoFormato=false;
					
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
			
				if(this.formatoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFormato==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormato.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormato.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.formato.getsType().equals("DUPLICADO")
				   || this.formato.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFormato=true;
				
				} else {
					this.isEsNuevoFormato=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.formatoSessionBean.getEsGuardarRelacionado()) {
					if(this.formato.getId()>=0 && !this.formato.getIsNew()) {						
						this.isEsNuevoFormato=false;
						
					} else {
						this.isEsNuevoFormato=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFormato(esRelaciones);						
				
				this.seleccionarFormato(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.formato.getId()<0) {
					this.isEsNuevoFormato=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFormato(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFormato(evt,rowIndex);
				}	
				
				if(this.formatoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Formato: " + this.dDif); 
					}
				}								
				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFormato(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.formato)) {
					if(this.formato.getId()>0) {
						this.formato.setIsDeleted(true);
						
						this.formatosEliminados.add(this.formato);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formatoLogic.getFormatos().remove(this.formato);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formatos.remove(this.formato);				
					}
					
					
					((FormatoModel) this.jTableDatosFormato.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFormato(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFormato(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFormato) {
			
			if(this.jInternalFrameDetalleFormFormato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormato.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormato.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFormato(this.formato);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.formatoConstantesFunciones.cargarid_empresaFormato || this.formatoConstantesFunciones.event_dependid_empresaFormato) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.formato.getid_empresa());
									//this.inicializarActualizarBindingFormato(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(formato.getEmpresa()!=null) {
							this.empresasForeignKey.add(formato.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.formato.getid_empresa(),false,"Formulario");

					//Modulo
					if(!this.formatoConstantesFunciones.cargarid_moduloFormato || this.formatoConstantesFunciones.event_dependid_moduloFormato) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.formato.getid_modulo());
									//this.inicializarActualizarBindingFormato(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(formato.getModulo()!=null) {
							this.modulosForeignKey.add(formato.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.formato.getid_modulo(),false,"Formulario");

					//TipoMovimiento
					if(!this.formatoConstantesFunciones.cargarid_tipo_movimientoFormato || this.formatoConstantesFunciones.event_dependid_tipo_movimientoFormato) {
						//this.cargarCombosTipoMovimientosForeignKeyLista(" where id="+this.formato.getid_tipo_movimiento());
									//this.inicializarActualizarBindingFormato(false,false);
						this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>();

						if(formato.getTipoMovimiento()!=null) {
							this.tipomovimientosForeignKey.add(formato.getTipoMovimiento());
						}

						this.addItemDefectoCombosForeignKeyTipoMovimiento();
						this.cargarCombosFrameTipoMovimientosForeignKey("Todos");
					}
					this.setActualTipoMovimientoForeignKey(this.formato.getid_tipo_movimiento(),false,"Formulario");

					//TipoFormato
					if(!this.formatoConstantesFunciones.cargarid_tipo_formatoFormato || this.formatoConstantesFunciones.event_dependid_tipo_formatoFormato) {
						//this.cargarCombosTipoFormatosForeignKeyLista(" where id="+this.formato.getid_tipo_formato());
									//this.inicializarActualizarBindingFormato(false,false);
						this.tipoformatosForeignKey=new ArrayList<TipoFormato>();

						if(formato.getTipoFormato()!=null) {
							this.tipoformatosForeignKey.add(formato.getTipoFormato());
						}

						this.addItemDefectoCombosForeignKeyTipoFormato();
						this.cargarCombosFrameTipoFormatosForeignKey("Todos");
					}
					this.setActualTipoFormatoForeignKey(this.formato.getid_tipo_formato(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFormato("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFormato(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormato() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormato(Formato formato) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFormato(formato,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormato(Formato formato,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFormato(formato);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFormato(formato,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFormato(formato);
	}
	
	public void setVariablesObjetoActualToFormularioFormato(Formato formato) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFormato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFormato.jLabelidFormato.setText(formato.getId().toString());
			this.jInternalFrameDetalleFormFormato.jTextFieldnombreFormato.setText(formato.getnombre());
			this.jInternalFrameDetalleFormFormato.jTextAreaubicacionFormato.setText(formato.getubicacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Formato formatoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,formatoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Formato formatoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				formatoLocal=this.formato;
			} else {
				formatoLocal=this.formatoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(formatoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFormato(formatoLocal,true);
					
					if(formatoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(formatoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.formatoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(formatoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFormato(Formato formato,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormato(formato,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFormato(formato);
	}
	
	public void setVariablesFormularioToObjetoActualFormato(Formato formato,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormato(formato,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFormato(Formato formato,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFormato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFormato.jLabelidFormato.getText()==null || this.jInternalFrameDetalleFormFormato.jLabelidFormato.getText()=="" || this.jInternalFrameDetalleFormFormato.jLabelidFormato.getText()=="Id") {
				this.jInternalFrameDetalleFormFormato.jLabelidFormato.setText("0");
			}

			if(conColumnasBase) {formato.setId(Long.parseLong(this.jInternalFrameDetalleFormFormato.jLabelidFormato.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormatoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormato.jLabelIdFormato,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formato.setnombre(this.jInternalFrameDetalleFormFormato.jTextFieldnombreFormato.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormatoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormato.jLabelnombreFormato,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formato.setubicacion(this.jInternalFrameDetalleFormFormato.jTextAreaubicacionFormato.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormatoConstantesFunciones.LABEL_UBICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormato.jLabelubicacionFormato,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormato(Formato formatoBean,Formato formato,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && formatoBean.getid_modulo()!=null && !formatoBean.getid_modulo().equals(-1L))) {formato.setid_modulo(formatoBean.getid_modulo());}
			if(conDefault || (!conDefault && formatoBean.getid_tipo_movimiento()!=null && !formatoBean.getid_tipo_movimiento().equals(-1L))) {formato.setid_tipo_movimiento(formatoBean.getid_tipo_movimiento());}
			if(conDefault || (!conDefault && formatoBean.getid_tipo_formato()!=null && !formatoBean.getid_tipo_formato().equals(-1L))) {formato.setid_tipo_formato(formatoBean.getid_tipo_formato());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFormato(Formato formatoOrigen,Formato formato,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formatoOrigen.getId()!=null && !formatoOrigen.getId().equals(0L))) {formato.setId(formatoOrigen.getId());}}
			if(conDefault || (!conDefault && formatoOrigen.getid_modulo()!=null && !formatoOrigen.getid_modulo().equals(-1L))) {formato.setid_modulo(formatoOrigen.getid_modulo());}
			if(conDefault || (!conDefault && formatoOrigen.getnombre()!=null && !formatoOrigen.getnombre().equals(""))) {formato.setnombre(formatoOrigen.getnombre());}
			if(conDefault || (!conDefault && formatoOrigen.getid_tipo_movimiento()!=null && !formatoOrigen.getid_tipo_movimiento().equals(-1L))) {formato.setid_tipo_movimiento(formatoOrigen.getid_tipo_movimiento());}
			if(conDefault || (!conDefault && formatoOrigen.getid_tipo_formato()!=null && !formatoOrigen.getid_tipo_formato().equals(-1L))) {formato.setid_tipo_formato(formatoOrigen.getid_tipo_formato());}
			if(conDefault || (!conDefault && formatoOrigen.getubicacion()!=null && !formatoOrigen.getubicacion().equals(""))) {formato.setubicacion(formatoOrigen.getubicacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormato(Formato formato) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormato.jLabelidFormato.setText(formato.getId().toString());
			this.jInternalFrameDetalleFormFormato.jTextFieldnombreFormato.setText(formato.getnombre());
			this.jInternalFrameDetalleFormFormato.jTextAreaubicacionFormato.setText(formato.getubicacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormato(FormatoBean formatoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormato.jLabelidFormato.setText(formatoBean.getId().toString());
			this.jInternalFrameDetalleFormFormato.jTextFieldnombreFormato.setText(formatoBean.getnombre());
			this.jInternalFrameDetalleFormFormato.jTextAreaubicacionFormato.setText(formatoBean.getubicacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFormato(FormatoParameterReturnGeneral formatoReturnGeneral,FormatoBean formatoBean,Boolean conDefault) throws Exception { 
		try {
			Formato formatoLocal=new Formato();
			
			formatoLocal=formatoReturnGeneral.getFormato();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formatoLocal.getId()!=null && !formatoLocal.getId().equals(0L))) {formatoBean.setId(formatoLocal.getId());}}
			if(conDefault || (!conDefault && formatoLocal.getid_modulo()!=null && !formatoLocal.getid_modulo().equals(-1L))) {formatoBean.setid_modulo(formatoLocal.getid_modulo());}
			if(conDefault || (!conDefault && formatoLocal.getnombre()!=null && !formatoLocal.getnombre().equals(""))) {formatoBean.setnombre(formatoLocal.getnombre());}
			if(conDefault || (!conDefault && formatoLocal.getid_tipo_movimiento()!=null && !formatoLocal.getid_tipo_movimiento().equals(-1L))) {formatoBean.setid_tipo_movimiento(formatoLocal.getid_tipo_movimiento());}
			if(conDefault || (!conDefault && formatoLocal.getid_tipo_formato()!=null && !formatoLocal.getid_tipo_formato().equals(-1L))) {formatoBean.setid_tipo_formato(formatoLocal.getid_tipo_formato());}
			if(conDefault || (!conDefault && formatoLocal.getubicacion()!=null && !formatoLocal.getubicacion().equals(""))) {formatoBean.setubicacion(formatoLocal.getubicacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFormatoGenerico(Long idFormatoSeleccionado,JComboBox jComboBoxFormato,List<Formato> formatosLocal)throws Exception {
		try {
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosLocal) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			jComboBoxFormato.setSelectedItem(formatoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFormatoGenerico(JComboBox jComboBoxFormato,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormato.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFormato.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormato.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFormato.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formato=(Formato) formatoLogic.getFormatos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formato =(Formato) formatos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!formato.getIsNew() && !formato.getIsChanged() && !formato.getIsDeleted()) {
				sDescripcion=formato.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=formato.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!formato.getIsNew() && !formato.getIsChanged() && !formato.getIsDeleted()) {
				sDescripcion=formato.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=formato.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("TipoMovimiento")) {
			//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
			if(!formato.getIsNew() && !formato.getIsChanged() && !formato.getIsDeleted()) {
				sDescripcion=formato.gettipomovimiento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
				sDescripcion=formato.gettipomovimiento_descripcion();
			}
		}

		if(sTipo.equals("TipoFormato")) {
			//sDescripcion=this.getActualTipoFormatoForeignKeyDescripcion((Long)value);
			if(!formato.getIsNew() && !formato.getIsChanged() && !formato.getIsDeleted()) {
				sDescripcion=formato.gettipoformato_descripcion();
			} else {
				//sDescripcion=this.getActualTipoFormatoForeignKeyDescripcion((Long)value);
				sDescripcion=formato.gettipoformato_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Formato formatoRow=new Formato();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formatoRow=(Formato) formatoLogic.getFormatos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formatoRow=(Formato) formatos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFormato(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFormato.setVisible((this.isVisibilidadCeldaNuevoFormato && this.isPermisoNuevoFormato));			
			this.jButtonDuplicarFormato.setVisible((this.isVisibilidadCeldaDuplicarFormato && this.isPermisoDuplicarFormato));			
			this.jButtonCopiarFormato.setVisible((this.isVisibilidadCeldaCopiarFormato && this.isPermisoCopiarFormato));
			this.jButtonVerFormFormato.setVisible((this.isVisibilidadCeldaVerFormFormato && this.isPermisoVerFormFormato));
			
			this.jButtonAbrirOrderByFormato.setVisible((this.isVisibilidadCeldaOrdenFormato && this.isPermisoOrdenFormato));			
			
			this.jButtonNuevoRelacionesFormato.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormato && this.isPermisoNuevoFormato));			
			this.jButtonNuevoGuardarCambiosFormato.setVisible((this.isVisibilidadCeldaNuevoFormato && this.isPermisoNuevoFormato && this.isPermisoGuardarCambiosFormato));
			
			if(this.jInternalFrameDetalleFormFormato!=null) {
			this.jInternalFrameDetalleFormFormato.jButtonModificarFormato.setVisible((this.isVisibilidadCeldaModificarFormato && this.isPermisoActualizarFormato));	
			this.jInternalFrameDetalleFormFormato.jButtonActualizarFormato.setVisible((this.isVisibilidadCeldaActualizarFormato && this.isPermisoActualizarFormato));	
			this.jInternalFrameDetalleFormFormato.jButtonEliminarFormato.setVisible((this.isVisibilidadCeldaEliminarFormato && this.isPermisoEliminarFormato));
			this.jInternalFrameDetalleFormFormato.jButtonCancelarFormato.setVisible(this.isVisibilidadCeldaCancelarFormato);							
			this.jInternalFrameDetalleFormFormato.jButtonGuardarCambiosFormato.setVisible((this.isVisibilidadCeldaGuardarFormato && this.isPermisoGuardarCambiosFormato));			
			
			}
						
			this.jButtonGuardarCambiosTablaFormato.setVisible((this.isVisibilidadCeldaGuardarCambiosFormato && this.isPermisoGuardarCambiosFormato));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFormato.setVisible((this.isVisibilidadCeldaNuevoFormato && this.isPermisoNuevoFormato));						
			this.jButtonDuplicarToolBarFormato.setVisible((this.isVisibilidadCeldaDuplicarFormato && this.isPermisoDuplicarFormato));						
			this.jButtonCopiarToolBarFormato.setVisible((this.isVisibilidadCeldaCopiarFormato && this.isPermisoCopiarFormato));			
			this.jButtonVerFormToolBarFormato.setVisible((this.isVisibilidadCeldaVerFormFormato && this.isPermisoVerFormFormato));			
			this.jButtonAbrirOrderByToolBarFormato.setVisible((this.isVisibilidadCeldaOrdenFormato && this.isPermisoOrdenFormato));
			this.jButtonNuevoRelacionesToolBarFormato.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormato && this.isPermisoNuevoFormato));			
			this.jButtonNuevoGuardarCambiosToolBarFormato.setVisible((this.isVisibilidadCeldaNuevoFormato && this.isPermisoNuevoFormato && this.isPermisoGuardarCambiosFormato));			
			
			if(this.jInternalFrameDetalleFormFormato!=null) {
			this.jInternalFrameDetalleFormFormato.jButtonModificarToolBarFormato.setVisible((this.isVisibilidadCeldaModificarFormato && this.isPermisoActualizarFormato));	
			this.jInternalFrameDetalleFormFormato.jButtonActualizarToolBarFormato.setVisible((this.isVisibilidadCeldaActualizarFormato  && this.isPermisoActualizarFormato));	
			this.jInternalFrameDetalleFormFormato.jButtonEliminarToolBarFormato.setVisible((this.isVisibilidadCeldaEliminarFormato && this.isPermisoEliminarFormato));
			this.jInternalFrameDetalleFormFormato.jButtonCancelarToolBarFormato.setVisible(this.isVisibilidadCeldaCancelarFormato);				
			this.jInternalFrameDetalleFormFormato.jButtonGuardarCambiosToolBarFormato.setVisible((this.isVisibilidadCeldaGuardarFormato && this.isPermisoGuardarCambiosFormato));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFormato.setVisible((this.isVisibilidadCeldaGuardarCambiosFormato && this.isPermisoGuardarCambiosFormato));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFormato.setVisible((this.isVisibilidadCeldaNuevoFormato && this.isPermisoNuevoFormato));			
			this.jMenuItemDuplicarFormato.setVisible((this.isVisibilidadCeldaDuplicarFormato && this.isPermisoDuplicarFormato));			
			this.jMenuItemCopiarFormato.setVisible((this.isVisibilidadCeldaCopiarFormato && this.isPermisoCopiarFormato));			
			this.jMenuItemVerFormFormato.setVisible((this.isVisibilidadCeldaVerFormFormato && this.isPermisoVerFormFormato));			
			this.jMenuItemAbrirOrderByFormato.setVisible((this.isVisibilidadCeldaOrdenFormato && this.isPermisoOrdenFormato));			
			//this.jMenuItemMostrarOcultarFormato.setVisible((this.isVisibilidadCeldaOrdenFormato && this.isPermisoOrdenFormato));
			this.jMenuItemDetalleAbrirOrderByFormato.setVisible((this.isVisibilidadCeldaOrdenFormato && this.isPermisoOrdenFormato));			
			//this.jMenuItemDetalleMostrarOcultarFormato.setVisible((this.isVisibilidadCeldaOrdenFormato && this.isPermisoOrdenFormato));			
			this.jMenuItemNuevoRelacionesFormato.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormato && this.isPermisoNuevoFormato));			
			this.jMenuItemNuevoGuardarCambiosFormato.setVisible((this.isVisibilidadCeldaNuevoFormato && this.isPermisoNuevoFormato && this.isPermisoGuardarCambiosFormato));									
			
			if(this.jInternalFrameDetalleFormFormato!=null) {
			this.jInternalFrameDetalleFormFormato.jMenuItemModificarFormato.setVisible((this.isVisibilidadCeldaModificarFormato && this.isPermisoActualizarFormato));	
			this.jInternalFrameDetalleFormFormato.jMenuItemActualizarFormato.setVisible((this.isVisibilidadCeldaActualizarFormato && this.isPermisoActualizarFormato));	
			this.jInternalFrameDetalleFormFormato.jMenuItemEliminarFormato.setVisible((this.isVisibilidadCeldaEliminarFormato && this.isPermisoEliminarFormato));
			this.jInternalFrameDetalleFormFormato.jMenuItemCancelarFormato.setVisible(this.isVisibilidadCeldaCancelarFormato);				
			}
			
			this.jMenuItemGuardarCambiosFormato.setVisible((this.isVisibilidadCeldaGuardarFormato && this.isPermisoGuardarCambiosFormato));						
			this.jMenuItemGuardarCambiosTablaFormato.setVisible((this.isVisibilidadCeldaGuardarCambiosFormato && this.isPermisoGuardarCambiosFormato));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFormato=this.jButtonNuevoFormato.isVisible();
			this.isVisibilidadCeldaDuplicarFormato=this.jButtonDuplicarFormato.isVisible();
			this.isVisibilidadCeldaCopiarFormato=this.jButtonCopiarFormato.isVisible();
			this.isVisibilidadCeldaVerFormFormato=this.jButtonVerFormFormato.isVisible();
			
			this.isVisibilidadCeldaOrdenFormato=this.jButtonAbrirOrderByFormato.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFormato=this.jButtonNuevoRelacionesFormato.isVisible();
			this.isVisibilidadCeldaModificarFormato=this.jButtonModificarFormato.isVisible();
			
			if(this.jInternalFrameDetalleFormFormato!=null) {
			this.isVisibilidadCeldaActualizarFormato=this.jInternalFrameDetalleFormFormato.jButtonActualizarFormato.isVisible();
			this.isVisibilidadCeldaEliminarFormato=this.jInternalFrameDetalleFormFormato.jButtonEliminarFormato.isVisible();
			this.isVisibilidadCeldaCancelarFormato=this.jInternalFrameDetalleFormFormato.jButtonCancelarFormato.isVisible();
			this.isVisibilidadCeldaGuardarFormato=this.jInternalFrameDetalleFormFormato.jButtonGuardarCambiosFormato.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFormato=this.jButtonGuardarCambiosTablaFormato.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFormato=this.jButtonNuevoToolBarFormato.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormato=this.jButtonNuevoRelacionesToolBarFormato.isVisible();
			
			if(this.jInternalFrameDetalleFormFormato!=null) {
			this.isVisibilidadCeldaModificarFormato=this.jInternalFrameDetalleFormFormato.jButtonModificarToolBarFormato.isVisible();
			this.isVisibilidadCeldaActualizarFormato=this.jInternalFrameDetalleFormFormato.jButtonActualizarToolBarFormato.isVisible();
			this.isVisibilidadCeldaEliminarFormato=this.jInternalFrameDetalleFormFormato.jButtonEliminarToolBarFormato.isVisible();
			this.isVisibilidadCeldaCancelarFormato=this.jInternalFrameDetalleFormFormato.jButtonCancelarToolBarFormato.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormato=this.jButtonGuardarCambiosToolBarFormato.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormato=this.jButtonGuardarCambiosTablaToolBarFormato.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFormato=this.jMenuItemNuevoFormato.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormato=this.jMenuItemNuevoRelacionesFormato.isVisible();
			
			if(this.jInternalFrameDetalleFormFormato!=null) {
			this.isVisibilidadCeldaModificarFormato=this.jInternalFrameDetalleFormFormato.jMenuItemModificarFormato.isVisible();
			this.isVisibilidadCeldaActualizarFormato=this.jInternalFrameDetalleFormFormato.jMenuItemActualizarFormato.isVisible();
			this.isVisibilidadCeldaEliminarFormato=this.jInternalFrameDetalleFormFormato.jMenuItemEliminarFormato.isVisible();
			this.isVisibilidadCeldaCancelarFormato=this.jInternalFrameDetalleFormFormato.jMenuItemCancelarFormato.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormato=this.jMenuItemGuardarCambiosFormato.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormato=this.jMenuItemGuardarCambiosTablaFormato.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFormato(Boolean esInicializar) {
		if(FormatoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.formatoSessionBean.getConGuardarRelaciones()) {
				//if(this.formatoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFormato();
			}
			
			this.inicializarActualizarBindingBotonesManualFormato(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFormato() {
		this.jButtonNuevoFormato.setVisible(this.isPermisoNuevoFormato);			
		this.jButtonDuplicarFormato.setVisible(this.isPermisoDuplicarFormato);			
		this.jButtonCopiarFormato.setVisible(this.isPermisoCopiarFormato);			
		this.jButtonVerFormFormato.setVisible(this.isPermisoVerFormFormato);			
		
		this.jButtonAbrirOrderByFormato.setVisible(this.isPermisoOrdenFormato);					
		
		this.jButtonNuevoRelacionesFormato.setVisible(this.isPermisoNuevoFormato);			
		
		if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormato.jButtonModificarFormato.setVisible(this.isPermisoActualizarFormato);	
			this.jInternalFrameDetalleFormFormato.jButtonActualizarFormato.setVisible(this.isPermisoActualizarFormato);	
			this.jInternalFrameDetalleFormFormato.jButtonEliminarFormato.setVisible(this.isPermisoEliminarFormato);
			this.jInternalFrameDetalleFormFormato.jButtonCancelarFormato.setVisible(this.isVisibilidadCeldaCancelarFormato);						
			this.jInternalFrameDetalleFormFormato.jButtonGuardarCambiosFormato.setVisible(this.isPermisoGuardarCambiosFormato);							
		}
		
		this.jButtonGuardarCambiosTablaFormato.setVisible(this.isPermisoActualizarFormato);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFormato() {
		this.jInternalFrameDetalleFormFormato.jButtonModificarFormato.setVisible(this.isPermisoActualizarFormato);	
		this.jInternalFrameDetalleFormFormato.jButtonActualizarFormato.setVisible(this.isPermisoActualizarFormato);	
		this.jInternalFrameDetalleFormFormato.jButtonEliminarFormato.setVisible(this.isPermisoEliminarFormato);
		this.jInternalFrameDetalleFormFormato.jButtonCancelarFormato.setVisible(this.isVisibilidadCeldaCancelarFormato);							
		this.jInternalFrameDetalleFormFormato.jButtonGuardarCambiosFormato.setVisible((this.isVisibilidadCeldaGuardarFormato && this.isPermisoGuardarCambiosFormato));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFormato() {
		if(FormatoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFormato();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFormato() {
	}
	
	public void jTableDatosFormatoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFormato(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFormatoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormato.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormato(this.getformato(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formato==null) {
						this.formato = new Formato();
					}

					this.setVariablesFormularioToObjetoActualFormato(this.formato,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
				}

				if(this.formato.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.formato.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormato(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFormatoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFormato(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormato.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormato.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormato.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormato(this.getformato(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.formatoLogic.getConnexion());

				if(this.formato.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.formato.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormato=(TitledBorder)this.jScrollPanelDatosFormato.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFormato.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFormatoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormato.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormato(this.getformato(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formato==null) {
						this.formato = new Formato();
					}

					this.setVariablesFormularioToObjetoActualFormato(this.formato,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
				}

				if(this.formato.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.formato.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormato(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloFormatoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebFormato(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormato.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormato.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormato.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormato(this.getformato(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.formatoLogic.getConnexion());

				if(this.formato.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.formato.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormato=(TitledBorder)this.jScrollPanelDatosFormato.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderFormato.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloFormatoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormato.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormato(this.getformato(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formato==null) {
						this.formato = new Formato();
					}

					this.setVariablesFormularioToObjetoActualFormato(this.formato,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
				}

				if(this.formato.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.formato.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormato(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreFormatoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormato.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormato(this.getformato(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formato==null) {
						this.formato = new Formato();
					}

					this.setVariablesFormularioToObjetoActualFormato(this.formato,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
				}

				if(this.formato.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.formato.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormato(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_movimientoFormatoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovimiento=true;

			idTienePermisotipomovimiento=this.tienePermisosUsuarioEnPaginaWebFormato(TipoMovimientoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovimiento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormato.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormato.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormato.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormato(this.getformato(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);

				this.tipomovimientoBeanSwingJInternalFrame=new TipoMovimientoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovimientoBeanSwingJInternalFrame.getTipoMovimientoLogic().setConnexion(this.formatoLogic.getConnexion());

				if(this.formato.getid_tipo_movimiento()!=null) {
					this.tipomovimientoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovimientoBeanSwingJInternalFrame.setIdActual(this.formato.getid_tipo_movimiento());
					this.tipomovimientoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMovimiento();
				}

				JInternalFrameBase jinternalFrame =this.tipomovimientoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormato=(TitledBorder)this.jScrollPanelDatosFormato.getBorder();
				TitledBorder titledBordertipomovimiento=(TitledBorder)this.tipomovimientoBeanSwingJInternalFrame.jScrollPanelDatosTipoMovimiento.getBorder();

				titledBordertipomovimiento.setTitle(titledBorderFormato.getTitle() + " -> Tipo Movimiento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_movimientoFormatoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormato.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormato(this.getformato(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formato==null) {
						this.formato = new Formato();
					}

					this.setVariablesFormularioToObjetoActualFormato(this.formato,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
				}

				if(this.formato.getid_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_movimiento = "+this.formato.getid_tipo_movimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormato(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_formatoFormatoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoformato=true;

			idTienePermisotipoformato=this.tienePermisosUsuarioEnPaginaWebFormato(TipoFormatoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoformato) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormato.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormato.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormato.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormato(this.getformato(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);

				this.tipoformatoBeanSwingJInternalFrame=new TipoFormatoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoformatoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoformatoBeanSwingJInternalFrame.getTipoFormatoLogic().setConnexion(this.formatoLogic.getConnexion());

				if(this.formato.getid_tipo_formato()!=null) {
					this.tipoformatoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoformatoBeanSwingJInternalFrame.setIdActual(this.formato.getid_tipo_formato());
					this.tipoformatoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoformatoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoformatoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFormato();
				}

				JInternalFrameBase jinternalFrame =this.tipoformatoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormato=(TitledBorder)this.jScrollPanelDatosFormato.getBorder();
				TitledBorder titledBordertipoformato=(TitledBorder)this.tipoformatoBeanSwingJInternalFrame.jScrollPanelDatosTipoFormato.getBorder();

				titledBordertipoformato.setTitle(titledBorderFormato.getTitle() + " -> Tipo Formato ");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_formatoFormatoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormato.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormato(this.getformato(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formato==null) {
						this.formato = new Formato();
					}

					this.setVariablesFormularioToObjetoActualFormato(this.formato,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
				}

				if(this.formato.getid_tipo_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_formato = "+this.formato.getid_tipo_formato().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormato(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonubicacionFormatoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormato.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormato(this.getformato(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formato==null) {
						this.formato = new Formato();
					}

					this.setVariablesFormularioToObjetoActualFormato(this.formato,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);
				}

				if(this.formato.getubicacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ubicacion like '%"+this.formato.getubicacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormato(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreFormatoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormato(false,false);

			this.getFormatosBusquedaPorNombre();

			this.inicializarActualizarBindingFormato(false);

			//if(FormatoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormato(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaFormatoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormato(false,false);

			this.getFormatosFK_IdEmpresa();

			this.inicializarActualizarBindingFormato(false);

			//if(FormatoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormato(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloFormatoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormato(false,false);

			this.getFormatosFK_IdModulo();

			this.inicializarActualizarBindingFormato(false);

			//if(FormatoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormato(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoFormatoFormatoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormato(false,false);

			this.getFormatosFK_IdTipoFormato();

			this.inicializarActualizarBindingFormato(false);

			//if(FormatoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormato(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMovimientoFormatoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormato(false,false);

			this.getFormatosFK_IdTipoMovimiento();

			this.inicializarActualizarBindingFormato(false);

			//if(FormatoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormato(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFormato() {
		if(this.jInternalFrameDetalleFormFormato!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormFormato!=null) {
			this.jInternalFrameDetalleFormFormato.setVisible(false);	    			
			this.jInternalFrameDetalleFormFormato.dispose();
			this.jInternalFrameDetalleFormFormato=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFormato!=null) {
			this.jInternalFrameReporteDinamicoFormato.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFormato.dispose();
			this.jInternalFrameReporteDinamicoFormato=null;
		}
		
		if(this.jInternalFrameImportacionFormato!=null) {
			this.jInternalFrameImportacionFormato.setVisible(false);	    			
			this.jInternalFrameImportacionFormato.dispose();
			this.jInternalFrameImportacionFormato=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFormato();
			
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
			
			
			if(sTipo.equals("NuevoFormato")) {
				jButtonNuevoFormatoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFormato")) {
				jButtonDuplicarFormatoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFormato")) {
				jButtonCopiarFormatoActionPerformed(evt);
			} else if(sTipo.equals("VerFormFormato")) {
				jButtonVerFormFormatoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFormato")) {
				jButtonNuevoFormatoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFormato")) {
				jButtonDuplicarFormatoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFormato")) {
				jButtonNuevoFormatoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFormato")) {
				jButtonDuplicarFormatoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFormato")) {
				jButtonNuevoFormatoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFormato")) {
				jButtonNuevoFormatoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFormato")) {
				jButtonNuevoFormatoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFormato")) {
				jButtonModificarFormatoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFormato")) {
				jButtonModificarFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFormato")) {
				jButtonModificarFormatoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFormato")) {
				jButtonActualizarFormatoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFormato")) {
				jButtonActualizarFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFormato")) {
				jButtonActualizarFormatoActionPerformed(evt);
			} else if(sTipo.equals("EliminarFormato")) {
				jButtonEliminarFormatoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFormato")) {
				jButtonEliminarFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFormato")) {
				jButtonEliminarFormatoActionPerformed(evt);
			} else if(sTipo.equals("CancelarFormato")) {
				jButtonCancelarFormatoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFormato")) {
				jButtonCancelarFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFormato")) {
				jButtonCancelarFormatoActionPerformed(evt);
			} else if(sTipo.equals("CerrarFormato")) {
				jButtonCerrarFormatoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFormato")) {
				jButtonCerrarFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFormato")) {
				jButtonCerrarFormatoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFormato")) {
				jButtonMostrarOcultarFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFormato")) {
				jButtonCancelarFormatoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFormato")) {
				jButtonGuardarCambiosFormatoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFormato")) {
				jButtonGuardarCambiosFormatoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFormato")) {
				jButtonCopiarFormatoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFormato")) {
				jButtonVerFormFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFormato")) {
				jButtonGuardarCambiosFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFormato")) {
				jButtonCopiarFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFormato")) {
				jButtonVerFormFormatoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFormato")) {
				jButtonGuardarCambiosFormatoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFormato")) {
				jButtonGuardarCambiosFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFormato")) {
				jButtonGuardarCambiosFormatoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFormato")) {
				jButtonRecargarInformacionFormatoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFormato")) {
				jButtonRecargarInformacionFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFormato")) {
				jButtonRecargarInformacionFormatoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFormato")) {
				jButtonAnterioresFormatoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFormato")) {
				jButtonAnterioresFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFormato")) {
				jButtonAnterioresFormatoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFormato")) {
				jButtonSiguientesFormatoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFormato")) {
				jButtonSiguientesFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFormato")) {
				jButtonSiguientesFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFormato") || sTipo.equals("MenuItemDetalleAbrirOrderByFormato")) {
				jButtonAbrirOrderByFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFormato") || sTipo.equals("MenuItemDetalleMostrarOcultarFormato")) {
				jButtonMostrarOcultarFormatoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFormato")) {
				jButtonNuevoGuardarCambiosFormatoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFormato")) {
				jButtonNuevoGuardarCambiosFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFormato")) {
				jButtonNuevoGuardarCambiosFormatoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFormato")) {
				jButtonCerrarReporteDinamicoFormatoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFormato")) {
				jButtonGenerarReporteDinamicoFormatoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFormato")) {
				
				jButtonGenerarExcelReporteDinamicoFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFormato")) {
				jButtonCerrarImportacionFormatoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFormato")) {
				
				jButtonGenerarImportacionFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFormato")) {
				
				jButtonAbrirImportacionFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFormato")) {
				jComboBoxTiposAccionesFormatoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFormato")) {
				jComboBoxTiposRelacionesFormatoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFormato")) {
				jComboBoxTiposAccionesFormatoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFormato")) {
				
				jComboBoxTiposSeleccionarFormatoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFormato")) {
				jTextFieldValorCampoGeneralFormatoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFormato")) {
				jButtonAbrirOrderByFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFormato")) {
				jButtonAbrirOrderByFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFormato")) {
				jButtonCerrarOrderByFormatoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormatoBusqueda")) {
				this.jButtonidFormatoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormatoUpdate")) {
				this.jButtonid_empresaFormatoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormatoBusqueda")) {
				this.jButtonid_empresaFormatoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloFormatoUpdate")) {
				this.jButtonid_moduloFormatoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloFormatoBusqueda")) {
				this.jButtonid_moduloFormatoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreFormatoBusqueda")) {
				this.jButtonnombreFormatoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoFormatoUpdate")) {
				this.jButtonid_tipo_movimientoFormatoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoFormatoBusqueda")) {
				this.jButtonid_tipo_movimientoFormatoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_formatoFormatoUpdate")) {
				this.jButtonid_tipo_formatoFormatoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_formatoFormatoBusqueda")) {
				this.jButtonid_tipo_formatoFormatoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ubicacionFormatoBusqueda")) {
				this.jButtonubicacionFormatoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreFormato")) {
				this.jButtonBusquedaPorNombreFormatoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdModuloFormato")) {
				this.jButtonFK_IdModuloFormatoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoFormatoFormato")) {
				this.jButtonFK_IdTipoFormatoFormatoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoMovimientoFormato")) {
				this.jButtonFK_IdTipoMovimientoFormatoActionPerformed(evt);
			}
			
			;
			
			
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFormato();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formato);
				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
				
				


				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Formato formatoLocal=null;
			
			if(!this.getEsControlTabla()) {
				formatoLocal=this.formato;
			} else {
				formatoLocal=this.formatoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formato);
				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
							
				
				


				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoAnterior =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatoAnterior =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
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
			
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
			
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
			
			


			
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formato);
				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
								
						
				


				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formato.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formato);
				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
								
				
				


				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoAnterior =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatoAnterior =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formato);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoAnterior =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatoAnterior =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formato);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formato);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formato);
				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
							
				
				


				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formato.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormato.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatoAnterior =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formatoAnterior =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
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
			
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
			
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
			
			


			
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formato);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formato);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formato);
				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
								
				
				


				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoAnterior =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatoAnterior =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formato);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formato);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formato);
				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFormato")) {
					jCheckBoxSeleccionarTodosFormatoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFormato")) {
					jCheckBoxSeleccionadosFormatoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFormato")) {
					
				}
				
				


				
				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.formato);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.formato);
				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
												
				
				


				
				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormato.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatoAnterior =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formatoAnterior =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formato);
				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
				
				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
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
			
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
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
			
			


			
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formato);
				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formato.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formato.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formato);
				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
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
				
				


				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Formato.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Formato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatoAnterior =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatoAnterior =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFormato")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFormatoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFormato.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.formato =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.formato =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.formato);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFormato")) {
				
				}
				
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFormato")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFormato.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFormato")) {
			
			}
			
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFormato();
			
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
			
			if(sTipo.equals("NuevoFormato")) {
				jButtonNuevoFormatoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFormato")) {
				jButtonDuplicarFormatoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFormato")) {
				jButtonCopiarFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFormato")) {
				jButtonVerFormFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFormato")) {
				jButtonNuevoFormatoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFormato")) {
				jButtonModificarFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFormato")) {
				jButtonActualizarFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFormato")) {
				jButtonEliminarFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFormato")) {
				jButtonGuardarCambiosFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFormato")) {
				jButtonCancelarFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFormato")) {
				jButtonCerrarFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFormato")) {
				jButtonGuardarCambiosFormatoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFormato")) {
				jButtonNuevoGuardarCambiosFormatoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFormato")) {
				jButtonAbrirOrderByFormatoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFormato")) {
				jButtonRecargarInformacionFormatoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFormato")) {
				jButtonAnterioresFormatoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFormato")) {
				jButtonSiguientesFormatoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormatoBusqueda")) {
				this.jButtonidFormatoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormatoUpdate")) {
				this.jButtonid_empresaFormatoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormatoBusqueda")) {
				this.jButtonid_empresaFormatoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloFormatoUpdate")) {
				this.jButtonid_moduloFormatoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloFormatoBusqueda")) {
				this.jButtonid_moduloFormatoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreFormatoBusqueda")) {
				this.jButtonnombreFormatoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoFormatoUpdate")) {
				this.jButtonid_tipo_movimientoFormatoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoFormatoBusqueda")) {
				this.jButtonid_tipo_movimientoFormatoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_formatoFormatoUpdate")) {
				this.jButtonid_tipo_formatoFormatoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_formatoFormatoBusqueda")) {
				this.jButtonid_tipo_formatoFormatoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ubicacionFormatoBusqueda")) {
				this.jButtonubicacionFormatoBusquedaActionPerformed(evt);
			}
			
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFormato();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFormato")) {
				closingInternalFrameFormato();
				
			} else if(sTipo.equals("jButtonCancelarFormato")) {
				JInternalFrameBase jInternalFrameDetalleFormFormato = (JInternalFrameBase)evt.getSource();
	            	
	            FormatoBeanSwingJInternalFrame jInternalFrameParent=(FormatoBeanSwingJInternalFrame)jInternalFrameDetalleFormFormato.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFormatoActionPerformed(null);
			}
			
			FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formato,new Object(),this.formatoParameterGeneral,this.formatoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFormato(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFormato(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFormato(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.formato)) {
			if(!esControlTabla) {
				if(FormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFormato(this.formato,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);			
				}
				
				if(this.formatoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFormato(this.formato,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formatoReturnGeneral=formatoLogic.procesarEventosFormatosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatoLogic.getFormatos(),this.formato,this.formatoParameterGeneral,this.isEsNuevoFormato,classes);//this.formatoLogic.getFormato()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFormato(this.formatoReturnGeneral,this.formatoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.formatoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFormato(classes,this.formatoReturnGeneral,this.formatoBean,false);
					}
						
					if(this.formatoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFormato(this.formatoReturnGeneral.getFormato());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFormato(this.formatoReturnGeneral.getFormato());	
					}
						
					if(this.formatoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFormato(this.formatoReturnGeneral.getFormato(),classes);//this.formatoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFormato(this.formato,classes);//this.formatoBean);									
				}
			
				if(FormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFormato(this.formato,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormato(this.formato);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.formatoAnterior!=null) {
						this.formato=this.formatoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formatoReturnGeneral=formatoLogic.procesarEventosFormatosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatoLogic.getFormatos(),this.formato,this.formatoParameterGeneral,this.isEsNuevoFormato,classes);//this.formatoLogic.getFormato()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formatoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formatoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.formatoReturnGeneral.getFormato(),formatoLogic.getFormatos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.formatoReturnGeneral.getFormato(),this.formatos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFormato.repaint();
				
				//((AbstractTableModel) this.jTableDatosFormato.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFormato();
			}
		}
	}
	
	public void actualizarVisualTableDatosFormato() throws Exception {
		
		FormatoModel formatoModel=(FormatoModel)this.jTableDatosFormato.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formatoModel.formatos=this.formatoLogic.getFormatos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			formatoModel.formatos=this.formatos;
		}
		
		
		((FormatoModel) this.jTableDatosFormato.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFormato() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getformatoAnterior(),this.formatoLogic.getFormatos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getformatoAnterior(),this.formatos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFormato();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFormato(Formato formato,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
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
										
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formato,new Object(),generalEntityParameterGeneral,this.formatoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.formatoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FormatoConstantesFunciones.getClassesRelationshipsOfFormato(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FormatoConstantesFunciones.getClassesRelationshipsFromStringsOfFormato(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFormato(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formato,new Object(),generalEntityParameterGeneral,this.formatoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFormato(FormatoBean formatoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFormato(ArrayList<Classe> classes,FormatoReturnGeneral formatoReturnGeneral,FormatoBean formatoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFormato(Formato formato,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.formato)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFormato = new FormatoDetalleFormJInternalFrame(jDesktopPane,this.formatoSessionBean.getConGuardarRelaciones(),this.formatoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFormato);
		this.jInternalFrameDetalleFormFormato.setVisible(false);
		this.jInternalFrameDetalleFormFormato.setSelected(false);						
		
		this.jInternalFrameDetalleFormFormato.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFormato.formatoLogic=this.formatoLogic;
		
		this.cargarCombosFrameForeignKeyFormato("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFormato();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormato();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFormato("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFormato();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFormato.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormato"));
		
		this.jInternalFrameDetalleFormFormato.jButtonModificarFormato.addActionListener(new ButtonActionListener(this,"ModificarFormato"));

		
		this.jInternalFrameDetalleFormFormato.jButtonModificarToolBarFormato.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormato"));
					
		this.jInternalFrameDetalleFormFormato.jMenuItemModificarFormato.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormato"));		
		
		
		
		this.jInternalFrameDetalleFormFormato.jButtonActualizarFormato.addActionListener (new ButtonActionListener(this,"ActualizarFormato"));
		
		
		this.jInternalFrameDetalleFormFormato.jButtonActualizarToolBarFormato.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormato"));
						
		this.jInternalFrameDetalleFormFormato.jMenuItemActualizarFormato.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormato"));		
		
		
		
		this.jInternalFrameDetalleFormFormato.jButtonEliminarFormato.addActionListener (new ButtonActionListener(this,"EliminarFormato"));
		
		
		this.jInternalFrameDetalleFormFormato.jButtonEliminarToolBarFormato.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormato"));
								
		this.jInternalFrameDetalleFormFormato.jMenuItemEliminarFormato.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormato"));		
		
		
		
		this.jInternalFrameDetalleFormFormato.jButtonCancelarFormato.addActionListener (new ButtonActionListener(this,"CancelarFormato"));
		
		
		this.jInternalFrameDetalleFormFormato.jButtonCancelarToolBarFormato.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormato"));
					
		this.jInternalFrameDetalleFormFormato.jMenuItemCancelarFormato.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormato"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFormato.jMenuItemDetalleCerrarFormato.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormato"));		
		
		
		
		this.jInternalFrameDetalleFormFormato.jButtonGuardarCambiosToolBarFormato.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormato"));
		
		
		
		this.jInternalFrameDetalleFormFormato.jButtonGuardarCambiosToolBarFormato.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormato"));
		
		
		
		this.jInternalFrameDetalleFormFormato.jComboBoxTiposAccionesFormularioFormato.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormato"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonidFormatoBusqueda.addActionListener(new ButtonActionListener(this,"idFormatoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormato.jButtonid_empresaFormatoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormatoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonid_empresaFormatoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormatoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormato.jButtonid_moduloFormatoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloFormatoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonid_moduloFormatoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloFormatoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonnombreFormatoBusqueda.addActionListener(new ButtonActionListener(this,"nombreFormatoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormato.jButtonid_tipo_movimientoFormatoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoFormatoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonid_tipo_movimientoFormatoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoFormatoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormato.jButtonid_tipo_formatoFormatoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_formatoFormatoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonid_tipo_formatoFormatoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_formatoFormatoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonubicacionFormatoBusqueda.addActionListener(new ButtonActionListener(this,"ubicacionFormatoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFormato.jTabbedPaneRelacionesFormato.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormato"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFormato"));
		
		if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormato.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormato"));
		}
		
		this.jTableDatosFormato.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFormato"));
		
		this.jTableDatosFormato.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFormato"));
		
		this.jButtonNuevoFormato.addActionListener(new ButtonActionListener(this,"NuevoFormato"));
		
		this.jButtonDuplicarFormato.addActionListener(new ButtonActionListener(this,"DuplicarFormato"));
		
		this.jButtonCopiarFormato.addActionListener(new ButtonActionListener(this,"CopiarFormato"));
		
		this.jButtonVerFormFormato.addActionListener(new ButtonActionListener(this,"VerFormFormato"));
		
		
		this.jButtonNuevoToolBarFormato.addActionListener(new ButtonActionListener(this,"NuevoToolBarFormato"));
			
		this.jButtonDuplicarToolBarFormato.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFormato"));
			
		this.jMenuItemNuevoFormato.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFormato"));
			
		this.jMenuItemDuplicarFormato.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFormato"));		
		
		
		this.jButtonNuevoRelacionesFormato.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFormato"));
		
		
		this.jButtonNuevoRelacionesToolBarFormato.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFormato"));
			
		this.jMenuItemNuevoRelacionesFormato.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFormato"));		
		
		
		if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormato.jButtonModificarFormato.addActionListener(new ButtonActionListener(this,"ModificarFormato"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormato.jButtonModificarToolBarFormato.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormato"));
			
			this.jInternalFrameDetalleFormFormato.jMenuItemModificarFormato.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormato"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFormato.jButtonActualizarFormato.addActionListener (new ButtonActionListener(this,"ActualizarFormato"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormato.jButtonActualizarToolBarFormato.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormato"));
				
			this.jInternalFrameDetalleFormFormato.jMenuItemActualizarFormato.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormato"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormato.jButtonEliminarFormato.addActionListener (new ButtonActionListener(this,"EliminarFormato"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormato.jButtonEliminarToolBarFormato.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormato"));
						
			this.jInternalFrameDetalleFormFormato.jMenuItemEliminarFormato.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormato"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormato.jButtonCancelarFormato.addActionListener (new ButtonActionListener(this,"CancelarFormato"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormato.jButtonCancelarToolBarFormato.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormato"));
			
			this.jInternalFrameDetalleFormFormato.jMenuItemCancelarFormato.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormato"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFormato.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFormato"));		
		
		
		this.jButtonCerrarFormato.addActionListener (new ButtonActionListener(this,"CerrarFormato"));
		
		
		this.jButtonCerrarToolBarFormato.addActionListener (new ButtonActionListener(this,"CerrarToolBarFormato"));
			
		this.jMenuItemCerrarFormato.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFormato"));
			
		if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormato.jMenuItemDetalleCerrarFormato.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormato"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormato.jButtonGuardarCambiosFormato.addActionListener (new ButtonActionListener(this,"GuardarCambiosFormato"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormato.jButtonGuardarCambiosToolBarFormato.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormato"));
		}
		
		this.jButtonCopiarToolBarFormato.addActionListener (new ButtonActionListener(this,"CopiarToolBarFormato"));
			
		this.jButtonVerFormToolBarFormato.addActionListener (new ButtonActionListener(this,"VerFormToolBarFormato"));
		
		this.jMenuItemGuardarCambiosFormato.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFormato"));
			
		this.jMenuItemCopiarFormato.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFormato"));		
		
		this.jMenuItemVerFormFormato.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFormato"));		
		
		
		this.jButtonGuardarCambiosTablaFormato.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormato"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFormato.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFormato"));
			
		this.jMenuItemGuardarCambiosTablaFormato.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormato"));		
		
		
		
		this.jButtonRecargarInformacionFormato.addActionListener (new ButtonActionListener(this,"RecargarInformacionFormato"));
					
		this.jButtonRecargarInformacionToolBarFormato.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFormato"));
		
		this.jMenuItemRecargarInformacionFormato.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFormato"));		
		
		
		
		this.jButtonAnterioresFormato.addActionListener (new ButtonActionListener(this,"AnterioresFormato"));
		
		
		this.jButtonAnterioresToolBarFormato.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFormato"));
		
		this.jMenuItemAnterioresFormato.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFormato"));		
		
		
		this.jButtonSiguientesFormato.addActionListener (new ButtonActionListener(this,"SiguientesFormato"));
		
		
		this.jButtonSiguientesToolBarFormato.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFormato"));
			
		this.jMenuItemSiguientesFormato.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFormato"));
			
		this.jMenuItemAbrirOrderByFormato.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFormato"));
			
		this.jMenuItemMostrarOcultarFormato.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFormato"));
			
		this.jMenuItemDetalleAbrirOrderByFormato.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFormato"));
			
		this.jMenuItemDetalleMostarOcultarFormato.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFormato"));		
		
		
		this.jButtonNuevoGuardarCambiosFormato.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFormato"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormato.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFormato"));
			
		this.jMenuItemNuevoGuardarCambiosFormato.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFormato"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFormato.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFormato"));

		this.jCheckBoxSeleccionadosFormato.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFormato"));
		
		if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormato.jComboBoxTiposAccionesFormularioFormato.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormato"));
		}
		
		
		this.jComboBoxTiposRelacionesFormato.addActionListener (new ButtonActionListener(this,"TiposRelacionesFormato"));
			
		this.jComboBoxTiposAccionesFormato.addActionListener (new ButtonActionListener(this,"TiposAccionesFormato"));
					
		this.jComboBoxTiposSeleccionarFormato.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFormato"));
			
		this.jTextFieldValorCampoGeneralFormato.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFormato"));		
		
		
		if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonidFormatoBusqueda.addActionListener(new ButtonActionListener(this,"idFormatoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormato.jButtonid_empresaFormatoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormatoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonid_empresaFormatoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormatoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormato.jButtonid_moduloFormatoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloFormatoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonid_moduloFormatoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloFormatoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonnombreFormatoBusqueda.addActionListener(new ButtonActionListener(this,"nombreFormatoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormato.jButtonid_tipo_movimientoFormatoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoFormatoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonid_tipo_movimientoFormatoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoFormatoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormato.jButtonid_tipo_formatoFormatoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_formatoFormatoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonid_tipo_formatoFormatoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_formatoFormatoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonubicacionFormatoBusqueda.addActionListener(new ButtonActionListener(this,"ubicacionFormatoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreFormato.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreFormato"));

			this.jButtonFK_IdModuloFormato.addActionListener(new ButtonActionListener(this,"FK_IdModuloFormato"));

			this.jButtonFK_IdTipoFormatoFormato.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormatoFormato"));

			this.jButtonFK_IdTipoMovimientoFormato.addActionListener(new ButtonActionListener(this,"FK_IdTipoMovimientoFormato"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFormato!=null) {
				this.jInternalFrameReporteDinamicoFormato.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormato"));
				this.jInternalFrameReporteDinamicoFormato.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormato"));
				this.jInternalFrameReporteDinamicoFormato.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormato"));
			}
			
			//this.jButtonCerrarReporteDinamicoFormato.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormato"));				
			//this.jButtonGenerarReporteDinamicoFormato.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormato"));
			//this.jButtonGenerarExcelReporteDinamicoFormato.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormato"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFormato!=null) {
				this.jInternalFrameImportacionFormato.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormato"));
				this.jInternalFrameImportacionFormato.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormato"));
				this.jInternalFrameImportacionFormato.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormato"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFormato.addActionListener (new ButtonActionListener(this,"AbrirOrderByFormato"));
			
			this.jButtonAbrirOrderByToolBarFormato.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFormato"));			
			
			if(this.jInternalFrameOrderByFormato!=null) {
				this.jInternalFrameOrderByFormato.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormato"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormato.jTabbedPaneRelacionesFormato.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormato"));
		
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
            		closingInternalFrameFormato();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFormato.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFormato = (JInternalFrameBase)event.getSource();
	            	
	            FormatoBeanSwingJInternalFrame jInternalFrameParent=(FormatoBeanSwingJInternalFrame)jInternalFrameDetalleFormFormato.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFormatoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFormato.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFormatoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFormato.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFormato.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFormato";
		inputMap = this.jButtonNuevoFormato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFormato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormatoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFormato";
		inputMap = this.jButtonNuevoRelacionesFormato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFormato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormatoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFormato";
		inputMap = this.jButtonModificarFormato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFormato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFormatoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFormato";
		inputMap = this.jButtonActualizarFormato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFormato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFormatoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFormato";
		inputMap = this.jButtonEliminarFormato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFormato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFormatoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFormato";
		inputMap = this.jButtonCancelarFormato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFormato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFormatoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFormato";
		inputMap = this.jButtonCerrarFormato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFormato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFormatoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFormato.jButtonGuardarCambiosFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFormato";
		inputMap = this.jInternalFrameDetalleFormFormato.jButtonGuardarCambiosFormato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFormato.jButtonGuardarCambiosFormato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFormatoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFormato.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFormatoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFormato.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFormatoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFormato.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFormatoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFormato.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFormatoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonidFormatoBusqueda.addActionListener(new ButtonActionListener(this,"idFormatoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormato.jButtonid_empresaFormatoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormatoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonid_empresaFormatoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormatoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormato.jButtonid_moduloFormatoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloFormatoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonid_moduloFormatoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloFormatoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonnombreFormatoBusqueda.addActionListener(new ButtonActionListener(this,"nombreFormatoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormato.jButtonid_tipo_movimientoFormatoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoFormatoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonid_tipo_movimientoFormatoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoFormatoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormato.jButtonid_tipo_formatoFormatoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_formatoFormatoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonid_tipo_formatoFormatoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_formatoFormatoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormato.jButtonubicacionFormatoBusqueda.addActionListener(new ButtonActionListener(this,"ubicacionFormatoBusqueda"));
		
		
		this.jButtonBusquedaPorNombreFormato.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreFormato"));

		this.jButtonFK_IdModuloFormato.addActionListener(new ButtonActionListener(this,"FK_IdModuloFormato"));

		this.jButtonFK_IdTipoFormatoFormato.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormatoFormato"));

		this.jButtonFK_IdTipoMovimientoFormato.addActionListener(new ButtonActionListener(this,"FK_IdTipoMovimientoFormato"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFormatoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFormato.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFormato(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Formato formatoAux:this.formatoLogic.getFormatos()) {
					formatoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Formato formatoAux:formatos) {
					formatoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFormatoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormato(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Formato formatoAux:this.formatoLogic.getFormatos()) {
						formatoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Formato formatoAux:formatos) {
						formatoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Formato formatoAux:this.formatoLogic.getFormatos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Formato formatoAux:formatos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFormato(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormato.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormato.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormato,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFormatoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormato(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFormato.getSelectedRows();
			
			Formato formatoLocal=new Formato();
			
			//this.seleccionarTodosFormato(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLocal =(Formato) this.formatoLogic.getFormatos().toArray()[this.jTableDatosFormato.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					formatoLocal =(Formato) this.formatos.toArray()[this.jTableDatosFormato.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				formatoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Formato formatoAux:this.formatoLogic.getFormatos()) {
						formatoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Formato formatoAux:formatos) {
						formatoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFormato(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormato.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormato.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormato,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFormatoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFormatoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFormatoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFormato(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFormato.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Formato formatoAux:this.formatoLogic.getFormatos()) {
				
						if(sTipoSeleccionar.equals(FormatoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							formatoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FormatoConstantesFunciones.LABEL_UBICACION)) {
							existe=true;
							formatoAux.setubicacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Formato formatoAux:formatos) {
					
						if(sTipoSeleccionar.equals(FormatoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							formatoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FormatoConstantesFunciones.LABEL_UBICACION)) {
							existe=true;
							formatoAux.setubicacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFormato(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFormatoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFormato(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFormato=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFormato.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFormato.jComboBoxTiposAccionesFormularioFormato.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFormato) {				
					conSplash=true;//false;										
					
					//this.startProcessFormato(conSplash);
				
					this.generarReporteFormatosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormato.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormato.jComboBoxTiposAccionesFormularioFormato.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFormatosSeleccionados();
				//this.jComboBoxTiposAccionesFormato.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormatosSeleccionados(false);
				//this.jComboBoxTiposAccionesFormato.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormatosSeleccionados(true);
				//this.jComboBoxTiposAccionesFormato.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormato();
				
				this.exportarFormatosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormato.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormato.jComboBoxTiposAccionesFormularioFormato.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFormatos();
				//this.importarFormatos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormato.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormato.jComboBoxTiposAccionesFormularioFormato.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormato();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFormatosSeleccionados();
				//this.jComboBoxTiposAccionesFormato.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Formato", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFormato();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFormato)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFormato(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Formato",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormato.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormato.jComboBoxTiposAccionesFormularioFormato.setSelectedIndex(0);					
				}	
			} 			
			else if(FormatoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFormato) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFormato(conSplash);
					
						//this.actualizarParametrosGeneralFormato();
						
						this.generarReporteProcesoAccionFormatosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFormato.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFormato.jComboBoxTiposAccionesFormularioFormato.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FormatoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO FormatoES SELECCIONADOS?", "MANTENIMIENTO DE Formato", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFormato();
				
						this.actualizarParametrosGeneralFormato();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.formatoReturnGeneral=formatoLogic.procesarAccionFormatosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.formatoLogic.getFormatos(),this.formatoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFormatoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormato.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormato.jComboBoxTiposAccionesFormularioFormato.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFormato();
					
					FormatoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFormatoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormato.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormato.jComboBoxTiposAccionesFormularioFormato.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFormato(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFormatoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFormato();
			
			if(this.jInternalFrameDetalleFormFormato==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Formato> formatosSeleccionados=new ArrayList<Formato>();		
			Formato formato=new Formato();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFormato(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFormato.getSelectedItem();
			
			
			
			
			formatosSeleccionados=this.getFormatosSeleccionados(true);
			//this.sTipoAccion;
			
			if(formatosSeleccionados.size()==1) {
				for(Formato formatoAux:formatosSeleccionados) {
					formato=formatoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFormato();
			
      		//this.finishProcessFormato(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFormatoReturnGeneral() throws Exception {
		if(this.formatoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.formatoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.formatoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.formatoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.formatoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.formatoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFormato(false);
		}
		
		if(this.formatoReturnGeneral.getConRetornoLista() || this.formatoReturnGeneral.getConRetornoObjeto()) {
			if(this.formatoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formatoLogic.setFormatos(this.formatoReturnGeneral.getFormatos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.formatoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formatoLogic.setFormato(this.formatoReturnGeneral.getFormato());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFormato(false);
		}
	}
	
	public void actualizarParametrosGeneralFormato() throws Exception {
		
		
	}
	
	public ArrayList<Formato> getFormatosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Formato> formatosSeleccionados=new ArrayList<Formato>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFormato) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Formato formatoAux:formatoLogic.getFormatos()) {
					if(formatoAux.getIsSelected()) {
						formatosSeleccionados.add(formatoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Formato formatoAux:this.formatos) {
					if(formatoAux.getIsSelected()) {
						formatosSeleccionados.add(formatoAux);				
					}
				}
			}
			
			if(formatosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						formatosSeleccionados.addAll(this.formatoLogic.getFormatos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						formatosSeleccionados.addAll(this.formatos);				
					}
				}
			}
		} else {
			formatosSeleccionados.add(this.formato);
		}
		
		return formatosSeleccionados;
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
	
	public void generarReporteFormatosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFormatosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFormatosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormatosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormatosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Formato",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFormatosSeleccionados() throws Exception {
		ArrayList<Formato> formatosSeleccionados=new ArrayList<Formato>();		
		
		formatosSeleccionados=this.getFormatosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFormatos("Todos",formatosSeleccionados);
		
	}	
	
	public void generarReporteNormalFormatosSeleccionados() throws Exception {
		ArrayList<Formato> formatosSeleccionados=new ArrayList<Formato>();		
		
		formatosSeleccionados=this.getFormatosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFormatos("Todos",formatosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFormatosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Formato> formatosSeleccionados=new ArrayList<Formato>();
		
		formatosSeleccionados=this.getFormatosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFormatos("Todos",formatosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFormatosSeleccionados() throws Exception {
		ArrayList<Formato> formatosSeleccionados=new ArrayList<Formato>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFormato();
		
		
		formatosSeleccionados=this.getFormatosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFormato();
		
		
		//this.generarReporteFormatos("Todos",formatosSeleccionados ,formatoImplementable,formatoImplementableHome);
	}
	
	public void mostrarImportacionFormatos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFormato();
		
		this.abrirFrameImportacionFormato();		
		
			
		//this.generarReporteFormatos("Todos",formatosSeleccionados ,formatoImplementable,formatoImplementableHome);
	}
	
	public void importarFormatos() throws Exception {		
	
	}
	
	public void exportarFormatosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFormatosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFormatosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFormatosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Formato",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFormatosSeleccionados() throws Exception {
		ArrayList<Formato> formatosSeleccionados=new ArrayList<Formato>();		
		
		formatosSeleccionados=this.getFormatosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formato."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFormato(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Formato formatoAux:formatosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFormato(formatoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//formatoAux.setsDetalleGeneralEntityReporte(formatoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFormato(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FormatoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoConstantesFunciones.LABEL_IDTIPOFORMATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoConstantesFunciones.LABEL_UBICACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFormato(Formato formato,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=formato.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=formato.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=formato.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formato.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formato.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formato.gettipomovimiento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formato.gettipoformato_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formato.getubicacion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFormatosSeleccionados() throws Exception {
		ArrayList<Formato> formatosSeleccionados=new ArrayList<Formato>();		
		
		formatosSeleccionados=this.getFormatosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formato.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Formatos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFormato(row);				
				iRow++;
			}				
			
			for(Formato formatoAux:formatosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFormato(formatoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFormatosSeleccionados() throws Exception {
		ArrayList<Formato> formatosSeleccionados=new ArrayList<Formato>();		
		
		formatosSeleccionados=this.getFormatosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formato.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("formatos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("formato");
			//elementRoot.appendChild(element);
		
			for(Formato formatoAux:formatosSeleccionados) {
				element = document.createElement("formato");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFormato(formatoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFormato(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FormatoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoConstantesFunciones.LABEL_IDTIPOFORMATO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoConstantesFunciones.LABEL_UBICACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFormato(Formato formato,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(formato.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(formato.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formato.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formato.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(formato.gettipomovimiento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formato.gettipoformato_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formato.getubicacion());				
	}
	
	public void setFilaDatosExportarXmlFormato(Formato formato,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FormatoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(formato.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FormatoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(formato.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FormatoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(formato.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementmodulo_descripcion = document.createElement(FormatoConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(formato.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementnombre = document.createElement(FormatoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(formato.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementtipomovimiento_descripcion = document.createElement(FormatoConstantesFunciones.IDTIPOMOVIMIENTO);
		elementtipomovimiento_descripcion.appendChild(document.createTextNode(formato.gettipomovimiento_descripcion()));
		element.appendChild(elementtipomovimiento_descripcion);

		Element elementtipoformato_descripcion = document.createElement(FormatoConstantesFunciones.IDTIPOFORMATO);
		elementtipoformato_descripcion.appendChild(document.createTextNode(formato.gettipoformato_descripcion()));
		element.appendChild(elementtipoformato_descripcion);

		Element elementubicacion = document.createElement(FormatoConstantesFunciones.UBICACION);
		elementubicacion.appendChild(document.createTextNode(formato.getubicacion().trim()));
		element.appendChild(elementubicacion);
	}
	
	public void generarReporteGroupGenericoFormatosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Formato> formatosSeleccionados=new ArrayList<Formato>();
		
		formatosSeleccionados=this.getFormatosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFormato(formatosSeleccionados);
		
		this.generarReporteFormatos("Todos",formatosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFormato(ArrayList<Formato> formatosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Formato formatoAux:formatosSeleccionados) {
				formatoAux.setsDetalleGeneralEntityReporte(formatoAux.toString());
			
				if(sTipoSeleccionar.equals(FormatoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					formatoAux.setsDescripcionGeneralEntityReporte1(formatoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					formatoAux.setsDescripcionGeneralEntityReporte1(formatoAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					formatoAux.setsDescripcionGeneralEntityReporte1(formatoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(FormatoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO)) {
					existe=true;
					formatoAux.setsDescripcionGeneralEntityReporte1(formatoAux.gettipomovimiento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoConstantesFunciones.LABEL_IDTIPOFORMATO)) {
					existe=true;
					formatoAux.setsDescripcionGeneralEntityReporte1(formatoAux.gettipoformato_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoConstantesFunciones.LABEL_UBICACION)) {
					existe=true;
					formatoAux.setsDescripcionGeneralEntityReporte1(formatoAux.getubicacion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFormato(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFormato=true;
				this.isVisibilidadCeldaNuevoRelacionesFormato=true;
				this.isVisibilidadCeldaGuardarCambiosFormato=true;
			}
			
			this.isVisibilidadCeldaModificarFormato=false;
			this.isVisibilidadCeldaActualizarFormato=false;
			this.isVisibilidadCeldaEliminarFormato=false;
			this.isVisibilidadCeldaCancelarFormato=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormato=true;
				} else {
					this.isVisibilidadCeldaGuardarFormato=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFormato=false;
			this.isVisibilidadCeldaNuevoRelacionesFormato=false;
			this.isVisibilidadCeldaGuardarCambiosFormato=false;
			this.isVisibilidadCeldaModificarFormato=false;
			this.isVisibilidadCeldaActualizarFormato=true;
			this.isVisibilidadCeldaEliminarFormato=false;
			this.isVisibilidadCeldaCancelarFormato=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormato=true;
				} else {
					this.isVisibilidadCeldaGuardarFormato=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFormato=false;
			this.isVisibilidadCeldaNuevoRelacionesFormato=false;
			this.isVisibilidadCeldaGuardarCambiosFormato=false;
			this.isVisibilidadCeldaModificarFormato=false;
			this.isVisibilidadCeldaActualizarFormato=true;
			this.isVisibilidadCeldaEliminarFormato=true;
			this.isVisibilidadCeldaCancelarFormato=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormato=true;
				} else {
					this.isVisibilidadCeldaGuardarFormato=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFormato=false;
			this.isVisibilidadCeldaNuevoRelacionesFormato=false;
			this.isVisibilidadCeldaGuardarCambiosFormato=false;
			this.isVisibilidadCeldaModificarFormato=false;
			this.isVisibilidadCeldaActualizarFormato=true;
			this.isVisibilidadCeldaEliminarFormato=false;
			this.isVisibilidadCeldaCancelarFormato=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormato=false;
				} else {
					this.isVisibilidadCeldaGuardarFormato=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFormato=true;
			this.isVisibilidadCeldaNuevoRelacionesFormato=true;
			this.isVisibilidadCeldaGuardarCambiosFormato=true;
			this.isVisibilidadCeldaModificarFormato=false;
			this.isVisibilidadCeldaActualizarFormato=false;
			this.isVisibilidadCeldaEliminarFormato=false;
			this.isVisibilidadCeldaCancelarFormato=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormato=true;
				} else {
					this.isVisibilidadCeldaGuardarFormato=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFormato=false;
			this.isVisibilidadCeldaNuevoRelacionesFormato=false;
			this.isVisibilidadCeldaGuardarCambiosFormato=false;
			this.isVisibilidadCeldaActualizarFormato=false;
			this.isVisibilidadCeldaEliminarFormato=false;
			this.isVisibilidadCeldaCancelarFormato=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormato=false;
				} else {
					this.isVisibilidadCeldaGuardarFormato=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFormato=false;
			this.isVisibilidadCeldaNuevoRelacionesFormato=false;
			this.isVisibilidadCeldaGuardarCambiosFormato=false;
			this.isVisibilidadCeldaModificarFormato=true;
			this.isVisibilidadCeldaActualizarFormato=false;
			this.isVisibilidadCeldaEliminarFormato=false;
			this.isVisibilidadCeldaCancelarFormato=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormato=false;
				} else {
					this.isVisibilidadCeldaGuardarFormato=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FormatoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFormato=true;
			this.isVisibilidadCeldaNuevoRelacionesFormato=true;
			this.isVisibilidadCeldaGuardarCambiosFormato=true;
		} else {
			this.actualizarEstadoPanelsFormato(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFormato=false;
			//this.isVisibilidadCeldaVerFormFormato=false;
			this.isVisibilidadCeldaDuplicarFormato=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!formatoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFormato=false;
		} else {
			this.isVisibilidadCeldaNuevoFormato=false;
			this.isVisibilidadCeldaGuardarCambiosFormato=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(formatoSessionBean.getEsGuardarRelacionado()) {
			if(!formatoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFormato=false;												
			}
			
			this.jButtonCerrarFormato.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFormato=false;
		}
		
		if(!this.permiteMantenimiento(this.formato)) {
			this.isVisibilidadCeldaActualizarFormato=false;
			this.isVisibilidadCeldaEliminarFormato=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFormato() {
	}
	
	public void actualizarEstadoPanelsFormato(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFormato!=null) {
				this.jScrollPanelDatosEdicionFormato.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormato!=null) {
				this.jTabbedPaneBusquedasFormato.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormato!=null) {
				this.jScrollPanelDatosFormato.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormato!=null) {
				this.jPanelPaginacionFormato.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormato!=null) {
				this.jPanelParametrosReportesFormato.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFormato!=null) {
				this.jScrollPanelDatosEdicionFormato.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormato!=null) {
				this.jTabbedPaneBusquedasFormato.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFormato!=null) {
				this.jScrollPanelDatosFormato.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormato!=null) {
				this.jPanelPaginacionFormato.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormato!=null) {
				this.jPanelParametrosReportesFormato.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFormato!=null) {
				this.jScrollPanelDatosEdicionFormato.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormato!=null) {
				this.jTabbedPaneBusquedasFormato.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormato!=null) {
				this.jScrollPanelDatosFormato.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormato!=null) {
				this.jPanelPaginacionFormato.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormato!=null) {
				this.jPanelParametrosReportesFormato.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFormato!=null) {
				this.jScrollPanelDatosEdicionFormato.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormato!=null) {
				this.jTabbedPaneBusquedasFormato.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormato!=null) {
				this.jScrollPanelDatosFormato.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormato!=null) {
				this.jPanelPaginacionFormato.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormato!=null) {
				this.jPanelParametrosReportesFormato.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFormato!=null) {
				this.jScrollPanelDatosEdicionFormato.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormato!=null) {
				this.jTabbedPaneBusquedasFormato.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormato!=null) {
				this.jScrollPanelDatosFormato.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormato!=null) {
				this.jPanelPaginacionFormato.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormato!=null) {
				this.jPanelParametrosReportesFormato.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFormato!=null) {
				this.jScrollPanelDatosEdicionFormato.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormato!=null) {
				this.jTabbedPaneBusquedasFormato.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormato!=null) {
				this.jScrollPanelDatosFormato.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormato!=null) {
				this.jPanelPaginacionFormato.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormato!=null) {
				this.jPanelParametrosReportesFormato.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFormato!=null) {
				this.jScrollPanelDatosEdicionFormato.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormato!=null) {
				this.jTabbedPaneBusquedasFormato.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormato!=null) {
				this.jScrollPanelDatosFormato.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormato!=null) {
				this.jPanelPaginacionFormato.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormato!=null) {
				this.jPanelParametrosReportesFormato.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.formatoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFormato!=null) {
					this.jTabbedPaneBusquedasFormato.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFormato!=null) {
				this.jPanelParametrosReportesFormato.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.formatoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormato!=null) {
				this.jTabbedPaneBusquedasFormato.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFormato!=null) {
				this.jPanelParametrosReportesFormato.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasFormato.remove(jPanelBusquedaPorNombreFormato);}

			this.isVisibilidadFK_IdModulo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasFormato.remove(jPanelFK_IdModuloFormato);}

			this.isVisibilidadFK_IdTipoFormato=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoFormato) {this.jTabbedPaneBusquedasFormato.remove(jPanelFK_IdTipoFormatoFormato);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasFormato.remove(jPanelFK_IdTipoMovimientoFormato);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadBusquedaPorNombre=isParaModuloNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasFormato.remove(jPanelBusquedaPorNombreFormato);}

			this.isVisibilidadFK_IdModulo=isParaModulo;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasFormato.remove(jPanelFK_IdModuloFormato);}

			this.isVisibilidadFK_IdTipoFormato=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTipoFormato) {this.jTabbedPaneBusquedasFormato.remove(jPanelFK_IdTipoFormatoFormato);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasFormato.remove(jPanelFK_IdTipoMovimientoFormato);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMovimiento(Boolean isParaTipoMovimiento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMovimientoNegation=!isParaTipoMovimiento;

			this.isVisibilidadBusquedaPorNombre=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasFormato.remove(jPanelBusquedaPorNombreFormato);}

			this.isVisibilidadFK_IdModulo=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasFormato.remove(jPanelFK_IdModuloFormato);}

			this.isVisibilidadFK_IdTipoFormato=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadFK_IdTipoFormato) {this.jTabbedPaneBusquedasFormato.remove(jPanelFK_IdTipoFormatoFormato);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaTipoMovimiento;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasFormato.remove(jPanelFK_IdTipoMovimientoFormato);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoFormato(Boolean isParaTipoFormato){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoFormatoNegation=!isParaTipoFormato;

			this.isVisibilidadBusquedaPorNombre=isParaTipoFormatoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasFormato.remove(jPanelBusquedaPorNombreFormato);}

			this.isVisibilidadFK_IdModulo=isParaTipoFormatoNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasFormato.remove(jPanelFK_IdModuloFormato);}

			this.isVisibilidadFK_IdTipoFormato=isParaTipoFormato;
			if(!this.isVisibilidadFK_IdTipoFormato) {this.jTabbedPaneBusquedasFormato.remove(jPanelFK_IdTipoFormatoFormato);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaTipoFormatoNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasFormato.remove(jPanelFK_IdTipoMovimientoFormato);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FormatoSessionBean formatoSessionBean=new FormatoSessionBean();
		
		if(this.formatoSessionBean==null) {
			this.formatoSessionBean=new FormatoSessionBean();
		}
		
		this.formatoSessionBean.setsUltimaBusquedaFormato(this.getsAccionBusqueda());
		this.formatoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.formatoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			formatoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			formatoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			formatoSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoFormato")) {
			formatoSessionBean.setid_tipo_formato(this.getid_tipo_formatoFK_IdTipoFormato());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoMovimiento")) {
			formatoSessionBean.setid_tipo_movimiento(this.getid_tipo_movimientoFK_IdTipoMovimiento());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FormatoSessionBean formatoSessionBean=new FormatoSessionBean();
		
		if(this.formatoSessionBean==null) {
			this.formatoSessionBean=new FormatoSessionBean();
		}
		
		if(this.formatoSessionBean.getsUltimaBusquedaFormato()!=null&&!this.formatoSessionBean.getsUltimaBusquedaFormato().equals("")) {
			this.setsAccionBusqueda(formatoSessionBean.getsUltimaBusquedaFormato());
			this.setiNumeroPaginacion(formatoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(formatoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(formatoSessionBean.getnombre());
				formatoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(formatoSessionBean.getid_empresa());
				formatoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(formatoSessionBean.getid_modulo());
				formatoSessionBean.setid_modulo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoFormato")) {
				this.setid_tipo_formatoFK_IdTipoFormato(formatoSessionBean.getid_tipo_formato());
				formatoSessionBean.setid_tipo_formato(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoMovimiento")) {
				this.setid_tipo_movimientoFK_IdTipoMovimiento(formatoSessionBean.getid_tipo_movimiento());
				formatoSessionBean.setid_tipo_movimiento(-1L);
			}
		}
		
		this.formatoSessionBean.setsUltimaBusquedaFormato("");
		this.formatoSessionBean.setiNumeroPaginacion(FormatoConstantesFunciones.INUMEROPAGINACION);
		this.formatoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFormato(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFormato() {
		this.updateBorderResaltarBusquedasFormularioFormato();
		this.updateVisibilidadBusquedasFormularioFormato();
		this.updateHabilitarBusquedasFormularioFormato();
	}
	
	public void updateBorderResaltarBusquedasFormularioFormato() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFormato.getComponents().length>0) {
	

		if(this.formatoConstantesFunciones.resaltarBusquedaPorNombreFormato!=null) {
			index= this.jTabbedPaneBusquedasFormato.indexOfComponent(this.jPanelBusquedaPorNombreFormato);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormato.getComponent(index);
				jPanel.setBorder(this.formatoConstantesFunciones.resaltarBusquedaPorNombreFormato);
			}
		}

		if(this.formatoConstantesFunciones.resaltarFK_IdModuloFormato!=null) {
			index= this.jTabbedPaneBusquedasFormato.indexOfComponent(this.jPanelFK_IdModuloFormato);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormato.getComponent(index);
				jPanel.setBorder(this.formatoConstantesFunciones.resaltarFK_IdModuloFormato);
			}
		}

		if(this.formatoConstantesFunciones.resaltarFK_IdTipoFormatoFormato!=null) {
			index= this.jTabbedPaneBusquedasFormato.indexOfComponent(this.jPanelFK_IdTipoFormatoFormato);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormato.getComponent(index);
				jPanel.setBorder(this.formatoConstantesFunciones.resaltarFK_IdTipoFormatoFormato);
			}
		}

		if(this.formatoConstantesFunciones.resaltarFK_IdTipoMovimientoFormato!=null) {
			index= this.jTabbedPaneBusquedasFormato.indexOfComponent(this.jPanelFK_IdTipoMovimientoFormato);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormato.getComponent(index);
				jPanel.setBorder(this.formatoConstantesFunciones.resaltarFK_IdTipoMovimientoFormato);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFormato() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFormato.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormato.indexOfComponent(this.jPanelBusquedaPorNombreFormato);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormato.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formatoConstantesFunciones.mostrarBusquedaPorNombreFormato);
			if(!this.formatoConstantesFunciones.mostrarBusquedaPorNombreFormato && index>-1) {
				this.jTabbedPaneBusquedasFormato.remove(index);
			}

			index= this.jTabbedPaneBusquedasFormato.indexOfComponent(this.jPanelFK_IdModuloFormato);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormato.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formatoConstantesFunciones.mostrarFK_IdModuloFormato);
			if(!this.formatoConstantesFunciones.mostrarFK_IdModuloFormato && index>-1) {
				this.jTabbedPaneBusquedasFormato.remove(index);
			}

			index= this.jTabbedPaneBusquedasFormato.indexOfComponent(this.jPanelFK_IdTipoFormatoFormato);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormato.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formatoConstantesFunciones.mostrarFK_IdTipoFormatoFormato);
			if(!this.formatoConstantesFunciones.mostrarFK_IdTipoFormatoFormato && index>-1) {
				this.jTabbedPaneBusquedasFormato.remove(index);
			}

			index= this.jTabbedPaneBusquedasFormato.indexOfComponent(this.jPanelFK_IdTipoMovimientoFormato);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormato.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formatoConstantesFunciones.mostrarFK_IdTipoMovimientoFormato);
			if(!this.formatoConstantesFunciones.mostrarFK_IdTipoMovimientoFormato && index>-1) {
				this.jTabbedPaneBusquedasFormato.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFormato() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFormato.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormato.indexOfComponent(this.jPanelBusquedaPorNombreFormato);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormato.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formatoConstantesFunciones.activarBusquedaPorNombreFormato);
				this.jTabbedPaneBusquedasFormato.setEnabledAt(index,this.formatoConstantesFunciones.activarBusquedaPorNombreFormato);
			}

			index= this.jTabbedPaneBusquedasFormato.indexOfComponent(this.jPanelFK_IdModuloFormato);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormato.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formatoConstantesFunciones.activarFK_IdModuloFormato);
				this.jTabbedPaneBusquedasFormato.setEnabledAt(index,this.formatoConstantesFunciones.activarFK_IdModuloFormato);
			}

			index= this.jTabbedPaneBusquedasFormato.indexOfComponent(this.jPanelFK_IdTipoFormatoFormato);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormato.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formatoConstantesFunciones.activarFK_IdTipoFormatoFormato);
				this.jTabbedPaneBusquedasFormato.setEnabledAt(index,this.formatoConstantesFunciones.activarFK_IdTipoFormatoFormato);
			}

			index= this.jTabbedPaneBusquedasFormato.indexOfComponent(this.jPanelFK_IdTipoMovimientoFormato);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormato.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formatoConstantesFunciones.activarFK_IdTipoMovimientoFormato);
				this.jTabbedPaneBusquedasFormato.setEnabledAt(index,this.formatoConstantesFunciones.activarFK_IdTipoMovimientoFormato);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFormato(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasFormato.indexOfComponent(this.jPanelBusquedaPorNombreFormato);

			this.jTabbedPaneBusquedasFormato.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormato.getComponent(index);

			this.formatoConstantesFunciones.setResaltarBusquedaPorNombreFormato(resaltar);

			jPanel.setBorder(this.formatoConstantesFunciones.resaltarBusquedaPorNombreFormato);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdModulo")) {
			index= this.jTabbedPaneBusquedasFormato.indexOfComponent(this.jPanelFK_IdModuloFormato);

			this.jTabbedPaneBusquedasFormato.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormato.getComponent(index);

			this.formatoConstantesFunciones.setResaltarFK_IdModuloFormato(resaltar);

			jPanel.setBorder(this.formatoConstantesFunciones.resaltarFK_IdModuloFormato);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoFormato")) {
			index= this.jTabbedPaneBusquedasFormato.indexOfComponent(this.jPanelFK_IdTipoFormatoFormato);

			this.jTabbedPaneBusquedasFormato.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormato.getComponent(index);

			this.formatoConstantesFunciones.setResaltarFK_IdTipoFormatoFormato(resaltar);

			jPanel.setBorder(this.formatoConstantesFunciones.resaltarFK_IdTipoFormatoFormato);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoMovimiento")) {
			index= this.jTabbedPaneBusquedasFormato.indexOfComponent(this.jPanelFK_IdTipoMovimientoFormato);

			this.jTabbedPaneBusquedasFormato.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormato.getComponent(index);

			this.formatoConstantesFunciones.setResaltarFK_IdTipoMovimientoFormato(resaltar);

			jPanel.setBorder(this.formatoConstantesFunciones.resaltarFK_IdTipoMovimientoFormato);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFormato.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFormato() throws Exception {

		if(this.jInternalFrameDetalleFormFormato==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFormato();
		this.updateVisibilidadResaltarControlesFormularioFormato();
		this.updateHabilitarResaltarControlesFormularioFormato();
		
	}
	
	public void updateBorderResaltarControlesFormularioFormato() throws Exception {
		if(this.jInternalFrameDetalleFormFormato==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.formatoConstantesFunciones.resaltaridFormato!=null && this.jInternalFrameDetalleFormFormato!=null) {this.jInternalFrameDetalleFormFormato.jLabelidFormato.setBorder(this.formatoConstantesFunciones.resaltaridFormato);}
		if(this.formatoConstantesFunciones.resaltarid_empresaFormato!=null && this.jInternalFrameDetalleFormFormato!=null) {this.jInternalFrameDetalleFormFormato.jComboBoxid_empresaFormato.setBorder(this.formatoConstantesFunciones.resaltarid_empresaFormato);}
		if(this.formatoConstantesFunciones.resaltarid_moduloFormato!=null && this.jInternalFrameDetalleFormFormato!=null) {this.jInternalFrameDetalleFormFormato.jComboBoxid_moduloFormato.setBorder(this.formatoConstantesFunciones.resaltarid_moduloFormato);}
		if(this.formatoConstantesFunciones.resaltarnombreFormato!=null && this.jInternalFrameDetalleFormFormato!=null) {this.jInternalFrameDetalleFormFormato.jTextFieldnombreFormato.setBorder(this.formatoConstantesFunciones.resaltarnombreFormato);}
		if(this.formatoConstantesFunciones.resaltarid_tipo_movimientoFormato!=null && this.jInternalFrameDetalleFormFormato!=null) {this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_movimientoFormato.setBorder(this.formatoConstantesFunciones.resaltarid_tipo_movimientoFormato);}
		if(this.formatoConstantesFunciones.resaltarid_tipo_formatoFormato!=null && this.jInternalFrameDetalleFormFormato!=null) {this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_formatoFormato.setBorder(this.formatoConstantesFunciones.resaltarid_tipo_formatoFormato);}
		if(this.formatoConstantesFunciones.resaltarubicacionFormato!=null && this.jInternalFrameDetalleFormFormato!=null) {this.jInternalFrameDetalleFormFormato.jTextAreaubicacionFormato.setBorder(this.formatoConstantesFunciones.resaltarubicacionFormato);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFormato() throws Exception {		
		if(this.jInternalFrameDetalleFormFormato==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormato!=null) {
	
		//this.jInternalFrameDetalleFormFormato.jLabelidFormato.setVisible(this.formatoConstantesFunciones.mostraridFormato);
		this.jInternalFrameDetalleFormFormato.jPanelidFormato.setVisible(this.formatoConstantesFunciones.mostraridFormato);
		//this.jInternalFrameDetalleFormFormato.jComboBoxid_empresaFormato.setVisible(this.formatoConstantesFunciones.mostrarid_empresaFormato);
		this.jInternalFrameDetalleFormFormato.jPanelid_empresaFormato.setVisible(this.formatoConstantesFunciones.mostrarid_empresaFormato);
		//this.jInternalFrameDetalleFormFormato.jComboBoxid_moduloFormato.setVisible(this.formatoConstantesFunciones.mostrarid_moduloFormato);
		this.jInternalFrameDetalleFormFormato.jPanelid_moduloFormato.setVisible(this.formatoConstantesFunciones.mostrarid_moduloFormato);
		//this.jInternalFrameDetalleFormFormato.jTextFieldnombreFormato.setVisible(this.formatoConstantesFunciones.mostrarnombreFormato);
		this.jInternalFrameDetalleFormFormato.jPanelnombreFormato.setVisible(this.formatoConstantesFunciones.mostrarnombreFormato);
		//this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_movimientoFormato.setVisible(this.formatoConstantesFunciones.mostrarid_tipo_movimientoFormato);
		this.jInternalFrameDetalleFormFormato.jPanelid_tipo_movimientoFormato.setVisible(this.formatoConstantesFunciones.mostrarid_tipo_movimientoFormato);
		//this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_formatoFormato.setVisible(this.formatoConstantesFunciones.mostrarid_tipo_formatoFormato);
		this.jInternalFrameDetalleFormFormato.jPanelid_tipo_formatoFormato.setVisible(this.formatoConstantesFunciones.mostrarid_tipo_formatoFormato);
		//this.jInternalFrameDetalleFormFormato.jTextAreaubicacionFormato.setVisible(this.formatoConstantesFunciones.mostrarubicacionFormato);
		this.jInternalFrameDetalleFormFormato.jPanelubicacionFormato.setVisible(this.formatoConstantesFunciones.mostrarubicacionFormato);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFormato() throws Exception {
		if(this.jInternalFrameDetalleFormFormato==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormato!=null) {
	
		this.jInternalFrameDetalleFormFormato.jLabelidFormato.setEnabled(this.formatoConstantesFunciones.activaridFormato);
		this.jInternalFrameDetalleFormFormato.jComboBoxid_empresaFormato.setEnabled(this.formatoConstantesFunciones.activarid_empresaFormato);
		this.jInternalFrameDetalleFormFormato.jComboBoxid_moduloFormato.setEnabled(this.formatoConstantesFunciones.activarid_moduloFormato);
		this.jInternalFrameDetalleFormFormato.jTextFieldnombreFormato.setEnabled(this.formatoConstantesFunciones.activarnombreFormato);
		this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_movimientoFormato.setEnabled(this.formatoConstantesFunciones.activarid_tipo_movimientoFormato);
		this.jInternalFrameDetalleFormFormato.jComboBoxid_tipo_formatoFormato.setEnabled(this.formatoConstantesFunciones.activarid_tipo_formatoFormato);
		this.jInternalFrameDetalleFormFormato.jTextAreaubicacionFormato.setEnabled(this.formatoConstantesFunciones.activarubicacionFormato);
		}
	}
	
		
}